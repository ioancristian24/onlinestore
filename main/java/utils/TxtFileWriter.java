package utils;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class TxtFileWriter {

    private String filename;
    private final static Logger logger = Logger.getLogger(Logger.class.getName());

    public TxtFileWriter(String filename) {
        this.filename = filename;
    }

    public void write(String line){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(line);
        }catch (FileNotFoundException e){
            logger.warning("File '" + filename + "' not found!");
        }catch (IOException e){
            logger.warning("Error! " + e.getMessage());
        }
    }
}
