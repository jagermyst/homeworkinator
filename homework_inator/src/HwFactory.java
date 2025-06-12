import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.exit;

public class HwFactory {

    static String readFile() throws FileNotFoundException {
        File file = new File("\"C:\\Users\\jager\\Documents\\projects\\Java\\Homework_inator\\homework_inator\\topics\\all_aviation.txt\"");
        Scanner fileReader = new Scanner(file);
        StringBuilder fileData = new StringBuilder();
        while (fileReader.hasNextLine()){
            fileData.append(fileReader.nextLine());
        }
        return (fileData.toString());
    }






    //The default HwFactory will be exclusively for aviation related topics, later we can make it compatible with multiple topics
    public  HwFactory() {
        try {
            System.out.println("hw factory no args " + readFile());
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            exit(1);
        }


    }
    public HwFactory(String student){
        System.out.println("hw factory 1 arg for ");
    }
}
