import java.util.*;
class Default{
	int i;
	float f;
	long l;
	short s;
	double d;
	byte b;
	boolean a;
	
	public void print(){
		System.out.println("Default value of int:" + i);
		System.out.println("Default value of float:" + f);
		System.out.println("Default value of long:" + l);
		System.out.println("Default value of short:" + s);
		System.out.println("Default value of double:" + d);
		System.out.println("Default value of byte:" + b);
		System.out.println("Default value of boolean:" + a);
	}
}

public class DefaultValue{
	public static void main(String[] args){
		Default def = new Default();
		def.print();
	}
}