package aggregators;

import fileprocessors.StockFileReader;

import java.io.IOException;
import java.util.List;

public class AggregatorProcessor<A extends Aggregator> {
	A agg;
	String filePath;

	public AggregatorProcessor(A agg, String filePath) {
	    this.agg = agg;
	    this.filePath = filePath;
    }

    public double runAggregator(int col) throws IOException {
		StockFileReader fr = new StockFileReader(filePath);
		List<String> fileData = fr.readFileData();
		int totalCol = fileData.get(0).split(",").length;
		// Check if input column is valid
		if(col <= 0 || totalCol < col) {
			return 0.00;
		}

		// Add the value at specified column number into numbers ArrayList
		for(String str : fileData) {
			String [] values = str.split(",");
			agg.add(Double.valueOf(values[col-1]));
		}

		return agg.calculate();
	}
}
