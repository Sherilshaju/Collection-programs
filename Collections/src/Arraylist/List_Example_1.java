package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class List_Example_1 {

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
    Iterator Itr=list.iterator();//it is used to traverse the elements one by one
    while(Itr.hasNext())
    {
    	System.out.println(Itr.next());
    
	}
	}

}
