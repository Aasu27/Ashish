import java.util.*;
public class Car {
	public static void main(String[] args){
		String name = "Swift", model = "BV";
		int yp = 2017, pp = 1000000, percent;
		System.out.println("Name : " + name + ", Model : " + model + ", Year of Purchase : " + yp + ", Purchase Price : " +pp);
		System.out.println("Car purchased in " + yp + " by " + pp + " rs");
		
		for(yp=2018;yp<=2019;yp++)
		{
			percent = (pp*10)/100;
			pp = pp-percent;
			System.out.println("Resale price in " + yp +" will be " + pp + " rs");
		}
		
	}
}
