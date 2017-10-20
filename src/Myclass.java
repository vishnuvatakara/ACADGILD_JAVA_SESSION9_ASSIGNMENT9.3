import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Hdtv{					//class hdtv
	String name;			//property brand name
	String size;			//property size 
	Scanner sc=new Scanner(System.in);
	Hdtv()
	{	//reading inputs from user 
		System.out.println("enter the brand name");
		name=sc.nextLine();
		System.out.println("enter the size in inch ");
		size=sc.next();
	}	

}

public class Myclass {
	
	public static void main(String[] args) {
		ArrayList<Hdtv> ar=new ArrayList<Hdtv>(); //creating arry list parameter of class object hdtv	
		Hdtv obj1=new Hdtv();
		ar.add(obj1);
		Hdtv obj2=new Hdtv();			//creating objects obj1,obj2,obj3 and add into array list
		ar.add(obj2);
		Hdtv obj3=new Hdtv();
		ar.add(obj3);
		Iterator itr=ar.iterator();
		while(itr.hasNext())
		{
			Hdtv obj=(Hdtv)itr.next();
			System.out.println(obj.name+"   "+obj.size);
			
		}

		

	}

}
