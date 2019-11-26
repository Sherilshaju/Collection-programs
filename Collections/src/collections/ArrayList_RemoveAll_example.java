package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_RemoveAll_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		ArrayList list=new ArrayList();//Arraylist classdeclaration
		//ArrayList<String>list=new ArrayList();//string is the data type
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name");
			String name=s.next();
			System.out.println("Enter the age");
		    int age=s.nextInt();
		    list.add(name);
		    list.add(age);
		    }
		ArrayList list1=(ArrayList) list.clone();
		//System.out.println("clone value\n"+list1.get(0));//get method
		System.out.println("Enter the updated name");
		String namer=s.next();
		System.out.println(list.set(0, namer));//set(index,variable)
		list.removeAll(list);
		System.out.println("List the values");
		    Iterator Itr=list.iterator();//it is used to traverse the elements one by one
		    while(Itr.hasNext())
		    {
		    	System.out.println(Itr.next());
		    
			}
			}

		

	
	}


