package Assign6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SaochepFile {
 public static void main(String[] args) {
        
        try {
            File fa = new File("D:\\textA.txt");
            File fb = new File("D:\\textB.txt");            
            copyFileUsingStream(fa, fb);
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }     

    }
    
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }    
}