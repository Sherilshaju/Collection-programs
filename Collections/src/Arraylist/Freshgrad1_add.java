package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Freshgrad1_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList list=new ArrayList();
     list.add("11");
     list.add("12");
     list.add("13");
     ArrayList list1=new ArrayList();
     list.add("133");
     list.addAll(list1);
     Iterator Itr=list.iterator();//it is used to traverse the elements one by one
	    while(Itr.hasNext())
	    {
	    	System.out.println(Itr.next());
	    
		}

	}

}
