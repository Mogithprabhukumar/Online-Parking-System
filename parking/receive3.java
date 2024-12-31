/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parking;

/**
 *
 * @author Mogith
 */
import java.net.*;
public class receive3 {
    public static void main(String args[]){
        try{
            DatagramSocket ds= new DatagramSocket(55555);
            byte[] bs = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bs,bs.length);
            ds.receive(dp);
            String str= new String(dp.getData());
            str = str.trim();
            System.out.print("msg received "+str);
            byte[] bs1 = new byte[1024];
             String str1= "i am receiver";
             bs1 = str1.getBytes();
             InetAddress ads = dp.getAddress();
             int port =dp.getPort();
            DatagramPacket send = new DatagramPacket(bs1,bs1.length,ads,port);
            ds.send(send);
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
