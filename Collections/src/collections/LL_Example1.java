package collections;
import java.util.LinkedList;
import java.util.Scanner;
public class LL_Example1 {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size");
    int n=s.nextInt();
    LinkedList list=new LinkedList();
    for(int i=0;i<n;i++)
    {
    	System.out.println("Enter the student name");
    	String name=s.next();
    	System.out.println("Enter the student Rollno");
    	int rollno=s.nextInt();
    	System.out.println("Enter the Department");
    	String dept=s.next();
    	System.out.println("Enter the total mark");
    	int m=s.nextInt();
    	System.out.println("Enter the Grade");
    	String grade=s.next();
    	list.add(name);
    	list.add(rollno);
    	list.add(dept);
    	list.add(m);
    	list.add(grade);
    }
    System.out.println("Size of list: "+list.size());
    System.out.println("list is Empty?(true/false) :"+list.isEmpty());
	}

}
