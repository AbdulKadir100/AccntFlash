
public class Project2 {
 
	protected int roll = 03;
	protected	String name = "Abdul";
	protected char sec = 'A';
	protected String colg = "COER";	

	void det() {
		System.out.println("Name is : "+name);
		System.out.println("College is : "+colg);
		System.out.println("Section is : "+sec);
		System.out.println("Roll nmbr is : "+roll);
	}	 
}
class Info extends Project2 {
	Info(){}
}
