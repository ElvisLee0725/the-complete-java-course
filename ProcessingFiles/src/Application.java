import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("myfile.txt");
        Scanner input = new Scanner(file);
        while(input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
        input.close();

        MyFileUtil mfu = new MyFileUtil();
        try {
            System.out.println(mfu.subtractByTen(4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
