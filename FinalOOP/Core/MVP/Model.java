package Core.MVP;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.io.*;

public class Model{
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
        PrintWriter writer = new PrintWriter("data.txt", "UTF-8");
        writer.close();
    }   
}