import java.io.*;
import java.net.*;
public class Readnet{
	public static void main(String[] args) {
		String host;
		int port;
		host=args[0];
		port=Integer.parseInt(args[1]);
		System.out.println("host"+host);
		System.out.println("port"+port);
		try{
			soc=new Socket(host,port);
			inStr=sock.getInputStream();
			System.out.println("ネットワークをつなぎます");
		}catch (Exception e){
			System.out.println("エラーです。");
			System.exit(1);
		}
	}
}