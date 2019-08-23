
class Std{
	int m1;
	int m2;
	int m3;
	void set_Data() {
		System.out.println("Marks of the subjects: "+m1+" "+m2+" "+m3);
		double avg = (m1+m2+m3)/3;
		System.out.println("Average is "+avg);
	}
	
}

public class First2 {
	public static void main(String[] args) {
	
		Std obj = new Std();
		obj.set_Data(70,60,80);

	}
}
