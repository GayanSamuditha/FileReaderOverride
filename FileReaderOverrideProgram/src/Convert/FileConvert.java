package Convert;

/**
 * @author Gayan Samuditha
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileConvert extends FileReader {

    public FileConvert(File file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public int read() throws IOException{
        int valueOfLetter = super.read();

        if(97 == valueOfLetter && valueOfLetter == 122){
            valueOfLetter = valueOfLetter - 32;
        }

        return valueOfLetter;
    }
}
