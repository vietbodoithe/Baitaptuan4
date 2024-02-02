
package baitaptuan4;

import java.net.URL;

public class T4URLViDu {
    public static void main(String[] args) {
        try {
            //tao doi tuong URL tu 1 dia chi URl
            //host?thamso1=giatri1&thamso2=giatri2
            URL url=new URL("https://fpl1.poly.edu.vn/goto.php?target=root 1&client id=fpolynhn");
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
            System.out.println("Port: "+url.getPort());
            System.out.println("Path: "+url.getPath());
            System.out.println("truy van:"+url.getQuery());
            System.out.println("Tham chieu: "+url.getRef());
        } catch (Exception e) {
        }
    }
}










