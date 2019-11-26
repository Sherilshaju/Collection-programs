package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Employeedetails_Example_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i;
String name;
int age;
Scanner s=new Scanner(System.in);
System.out.println("Enter the size");
n=s.nextInt();
ArrayList a1=new ArrayList();
Employee[] emp=new Employee[n];
for(i=0;i<n;i++)
{
	System.out.println("Enter the name");
	 name=s.next();
	System.out.println("Enter the age");
     age=s.nextInt();
   emp[i]=new Employee();
    emp[i].setName(name);
    emp[i].setAge(age);
    a1.add(emp[i]);
}
Iterator<Employee> Itr=a1.iterator();//create iterator object for employee class
while(Itr.hasNext())
{
	Employee e=Itr.next();
	System.out.println(e.getName()+" "+e.getAge());

}
	}

}
