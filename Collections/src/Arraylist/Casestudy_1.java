package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Casestudy_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i=1;
		int j;
		String c;
		System.out.println("Enter the size");
		int n=s.nextInt();
		ArrayList list=new ArrayList();
		Customer[] cust=new Customer[n];
		
		for(j=0;j<n;j++)
		{
			System.out.println("Enter the name");
			String name=s.next();
			System.out.println("Enter the Address");
		    String addr=s.next();
		    System.out.println("Enter the Contact number");
			int num=s.nextInt();
			System.out.println("Enter the Mail ID");
		    String email=s.next();
		    System.out.println("Enter the Proof Type");
			String ptype=s.next();
			System.out.println("Enter the Proof ID");
		    String pid=s.next();
		    cust[j]=new Customer();
		  
		    System.out.println("Thanks for registering..your ID is "+i);
		    i++;
		    System.out.println("Do you want to update email(yes/no)?");
		     c=s.next();
		    String m= c.toUpperCase();
		     if(m.equals("YES"))
		     {
		    	 System.out.println("Enter the updated email");
		    	 String newmail=s.next();
		    	 cust[j].setName(name);
				  cust[j].setAddr(addr);
				  cust[j].setNum(num);
				  cust[j].setEmail(newmail);
				  cust[j].setPtype(ptype);
				  cust[j].setPid(pid);
		     }
		     else {
		    	 cust[j].setName(name);
				  cust[j].setAddr(addr);
				  cust[j].setNum(num);
				  cust[j].setEmail(email);
				  cust[j].setPtype(ptype);
				  cust[j].setPid(pid); 
		     }
		     list.add(cust[j]);
		    
		    }
		int d=0;
		Iterator<Customer> Itr=list.iterator();//create iterator object for customer class
		for(j=0;Itr.hasNext();j++)
		{		
			d=j;d++;
			Customer c1=Itr.next();
			System.out.println("Customer "+d);
			System.out.println("name : "+c1.getName()+"\n "+"Address : "+c1.getAddr()+"\n "+"Contact number :"+c1.getNum()+" \n"+"Email ID :"+c1.getEmail()+" \n"+"Proof Type: "+c1.getPtype()+"\n "+"Proof ID :"+c1.getPid()+"\n----------");
			
		}
		//ArrayList list1=new ArrayList();
		System.out.println("ID\tName");
		for(j=0;j<n;j++)
		{	
		System.out.println(j+"\t"+cust[j].name);
		}
		System.out.println("Do you want to remove any customer details(yes/no)");
		String yn=s.next();
		String ny=yn.toUpperCase();
		if(ny.equals("YES"))
		{
			System.out.println("Enter the index to be removed");
			int id=s.nextInt();
			list.remove(id);
			Iterator<Customer> Itr1=list.iterator();//create iterator object for customer class
		
		for(j=0;Itr1.hasNext();j++)
			{d=j;d++;
				Customer c1=Itr1.next();
				System.out.println("Customer "+d);
				System.out.println("name : "+c1.getName()+"\n"+"Address : "+c1.getAddr()+"\n"+"Contact number :"+c1.getNum()+"\n"+"Email ID :"+c1.getEmail()+"\n"+"Proof Type: "+c1.getPtype()+"\n"+"Proof ID :"+c1.getPid()+"\n----------");
				System.out.println("Thankyou for registering");
			}
		}
		
	}  

}
