package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HAshsetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashSet<String> set=new HashSet<String>();
		     set.add("Sujith");
		     set.add("Simnad");
		     set.add("Akshay");
		     set.add("Chandhumol");
		     set.add("Mariya");
		     set.add("Simnad");
		     set.add("Neha");
		     set.add("Akshay");
		     Iterator<String> Itr=set.iterator();
		     while(Itr.hasNext())
		     {
		    	 System.out.println(Itr.next());
		     }
	}

}
