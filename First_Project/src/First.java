import java.io.*;
import java.lang.*;
class Employee{
	private	int id = 101;
	private String name = "Abdul";
		void display_Details() {
			System.out.println("Id is :"+id);
			System.out.println("Name is :"+name);
		}
	}
	class Student{
		int id = 03;
		String name = "Kadir";
		void display_Details() {
			System.out.println("Id is :"+id);
			System.out.println("Name is :"+name);
		}
	}
	
public class First {
	public static void main(String []args) {
	Employee em = new Employee();
	Student s1 = new Student();
	s1.display_Details();
	em.display_Details();
	

}
}