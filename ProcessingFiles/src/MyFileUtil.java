import com.elvis.exceptions.FooRuntimeException;

public class MyFileUtil {
    public int subtractByTen(int num) throws FooRuntimeException {
        if(num < 10) {
            throw new FooRuntimeException("Input is less than 10");
        }
        return num - 10;
    }
}
