
package baitaptuan4;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author viethayho
 */
public class T4URLViDu2 {
    public static void main(String[] args) {
        try {
            //tao doi tron tu dia chi URL
            URL url=new URL("https://www.google.com");
             //mo ket noi den url
             URLConnection uRLConnection=url.openConnection();
             //doc du lieu tu ket noi
             BufferedReader reader= new BufferedReader(
             new InputStreamReader(uRLConnection.getInputStream()));
             //tao doi tuong ghi
             FileWriter fileWriter= new FileWriter("output.html");
             //doc tung dong
             String line="";
             while ((line=reader.readLine())!=null) {  
                 //ghi vao file
                fileWriter.write(line+"\n");
            }
             //dong luong
             reader.close();
             fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
