package Convert;


/**
 * @author Gayan Samuditha
 */

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
         FileConvert fileConvert = new FileConvert(new File("D:/My Developments/FileReaderOverrideProgram/ConversionFile.txt"));

         int letterValue = 0;

         while ((letterValue = fileConvert.read()) != -1){
             System.out.println((char) letterValue);
             fileConvert.close();
         }

    }
}
