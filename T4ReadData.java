
package baitaptuan4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.Buffer;

/**
 *
 * @author viethayho
 */
public class T4ReadData {
    public static void main(String[] args) {
        try {
        //tao doi tuong url tu 1 dia chi
        URL url=new URL("http://www.google.com");
        //mo ket noi den url
        URLConnection uRLConnection=url.openConnection();
        //doc du lieu tu ket noi
        BufferedReader reader=new  BufferedReader(
        new InputStreamReader(uRLConnection.getInputStream()));
        //doc tung dong
        String line;
            while ((line=reader.readLine()) !=null) {                
                System.out.println(line);// in ra du lieu doc duoc
            }
            //dong luong
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
