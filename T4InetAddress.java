
package baitaptuan4;
import java.net.InetAddress;
public class T4InetAddress {
    public static void main(String[] args){
        try {
            InetAddress addByName=InetAddress.getByName("www.google.com");
            InetAddress addByIP=InetAddress.getByName("192.168.1.26");
            System.out.println("Address By Name: "+addByName);
            System.out.println("Address By IP" +addByIP);
            //su dung getter, setter de lay thong tin ve dia chi IP
            //lay ten may chu
            InetAddress addByName1=InetAddress.getByName("www.vnexpress.com");
            String hostname=addByName1.getHostName();
            System.out.println("Host Name:" +hostname);
            // lay dia chi IP
            String ip=addByName1.getHostAddress();
            System.out.println("Dia chi IP" +ip);
            //-----------
            InetAddress addByName2=InetAddress.getByName("www.vnexpress.com");
            //kiem tra dia chi IP co phai la IP4
            boolean isIP4 = addByName2 instanceof java.net.Inet4Address;
            System.out.println("co phai IP4 khong? "+isIP4);
            //kiem tra dia chi IP co phai la IP6
            boolean isIP6 = addByName2 instanceof java.net.Inet6Address;
            System.out.println("co phai IP6 khong? "+isIP6);
        } catch (Exception e) {
        }
    }
}
