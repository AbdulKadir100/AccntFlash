import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;
import java.util.*;

public class IP3 {

	public static void main(String[] args)throws Exception {
		URL obj = new URL("http://www.yahoo.com/index.html");
		URLConnection conn = obj.openConnection();
		System.out.println("Date "+new Date(conn.getDate()));
		System.out.println("Content Type :"+conn.getContentType());
		System.out.println("Expire :"+conn.getExpiration());
		System.out.println("Modified Date :"+ new Date(conn.getLastModified()));
		int l = conn.getContentLength();
		System.out.println("Content Length is :"+l);
		if(l==0)
		{
			System.out.print("Content not avaiolable ");
			return ;
		}
		else {
			int ch;
			InputStream in = conn.getInputStream();
			while((ch = in.read()) != -1);
			System.out.println((char)ch);
		}
		
		
	}

}
