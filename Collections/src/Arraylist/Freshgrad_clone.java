package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Freshgrad_clone {

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
		    ArrayList list1=(ArrayList) list.clone();//copy the values of list to list1
		    Iterator Itr1=list.iterator();//it is used to traverse the elements one by one
		    System.out.println("\nCLONE VALUE ");
		    while(Itr1.hasNext())
		    {
		    	
		    	System.out.print(Itr1.next()+" ");
		    
			}
			
	}

}
