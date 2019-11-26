package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Freshgrad_update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();//creating array list
	     list.add("11");
	     list.add("12");
	     list.add("13");//adding elements into the list
	     
	     Iterator Itr=list.iterator();//it is used to traverse the elements one by one
		    while(Itr.hasNext())
		    {
		    	System.out.println(Itr.next());
		    
			}
		   // System.out.println("Enter the updated value");
		     list.set(0, "111");
		     Iterator Itr1=list.iterator();//it is used to traverse the elements one by one
		     System.out.println("The list values");
			    while(Itr1.hasNext())
			    {
			    	System.out.println(Itr1.next());
			    
				}
	}

}
