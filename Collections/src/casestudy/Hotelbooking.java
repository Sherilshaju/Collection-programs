package casestudy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hotelbooking {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		HashSet set=new HashSet();
		Custom c=new Custom();
		Custom c1[]=new Custom[50];
		String ac,cot,wifi,laundry,cable,proceed;
		System.out.println("Choose the Option below");
		System.out.println("1.Book\n2.Check status\n3.Exit");
	    int choice=s.nextInt();
	    int i=1;
	    int a[]=new int[50];
	    do {
	    switch(choice)
	    {
	    case 1:
	    {   do {
	    	
	    	System.out.println("Choose the requirements");
	    	System.out.println("AC or nonAC(Y/N)");
	    	ac=s.next();
	    	System.out.println("Cot single or double (Y/N)");
	    	cot=s.next();
	    	System.out.println("You want Wifi(Y/N)");
	    	wifi=s.next();
	    	System.out.println("You need Laundry service(Y/N)");
	    	laundry=s.next();
	    	System.out.println("You want cable(Y/N)");
	    	cable=s.next();
	    	set.add(ac);
	    	set.add(cot);
	    	set.add(wifi);
	    	set.add(laundry);
	    	set.add(cable);
	    	System.out.println("Do you want proceed (Y/N)");
	    	proceed=s.next();
	    	proceed=proceed.toUpperCase();
	    }while(proceed.equals("Y"));
	    System.out.println("Thank for bokking yor booking number is "+i);
	    a[i]=i;
	    i++;
	   double d= c.calc();
	    System.out.println("Total amount is "+d);
	    System.out.println("Your Choosen Services are");
	    Iterator itr=set.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	    	break;
	    }
	    case 2:
	    {
	    	System.out.println("Please enter the room number");
            int room=s.nextInt();	 
            if(room==a[i])
            {
            	System.out.println("Choose another room number");
            }
            else
            {
            	System.out.println("Room is available");
            }
	    	break;
	    }
	    case 3:
	    {
	    	System.out.println("Sussfully Exit");
	    	System.exit(0);
	    	
	    	break;
	    }
	    default:
	    	System.out.println("Enter Valid Option man......");
	    }
	    }while(choice==4);
		
	}

}
