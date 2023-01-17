import java.io.*;
import java.net.*;

class inet{
public static void main(String[] arg){
try{
InetAddress ip = InetAddress.getByName("www.witsolapur.org");

System.out.println("Host Name : " + ip.getHostName());
System.out.println("IP Address : " + ip.getHostAddress());
}
catch(Exception e){
System.out.println(e);
}
}
}