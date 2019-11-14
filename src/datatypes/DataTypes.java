package datatypes;

public class DataTypes {
	public void add1() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("output"+c);
	}
	
	
public void add1(int a) {
		System.out.println(a);
		
}
public void add1(String a) {
	System.out.println(a);
}
public void add1(int a,String s) {
	System.out.println(a+s);
}
public void add1(String s,int a) {
	System.out.println(s+a);
}
public void add1(int a,int b) {
	System.out.println(a*b);
}

public static void main(String[]args) {
	DataTypes m=new DataTypes();
	m.add1();
	m.add1(8);
	m.add1("gowtham");
	m.add1(100,"jack");
	m.add1("pollachi",88);
	m.add1("gie",52);
	m.add1(20,30);
}
      

}
