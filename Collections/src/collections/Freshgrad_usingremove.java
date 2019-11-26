package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Freshgrad_usingremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList list=new ArrayList();//creating array list
	     list.add("11");
	     list.add("12");
	     list.add("13");//adding elements into the list
	     Iterator Itr=list.iterator();//it is used to traverse the elements one by one
		    while(Itr.hasNext())
		    {
		    	System.out.print(Itr.next()+" ");
		    
			}
		    System.out.println("\nList cleared ...");
		    list.clear();//clear all elements
		    
		  
	}

}
