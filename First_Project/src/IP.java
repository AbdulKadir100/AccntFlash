import java.io.*;
import java.net.*;
public class IP {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter website name");
		String site = br.readLine();
		try {
			InetAddress ip = InetAddress.getByName(site);
			System.out.println("IP Addresss is :"+ip);
		}catch(UnknownHostException ue){
			System.out.println("Website not Found :");
		}
	}
	

}
