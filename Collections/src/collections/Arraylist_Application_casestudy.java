package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist_Application_casestudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,i;
		int count=0,f=0,index=0;
		ArrayList list=new ArrayList();
		
		do {
			System.out.println("1.Display installed Application\n2.Install an Application\n3.Uninstall an Application\n4.Quit");
			 n=s.nextInt();
			
		if(n==1)
		{
			if(list.isEmpty()==true)
			{
				System.out.println("There is no application installed\n");
			}
			else
			{
				Iterator Itr=list.iterator();//it is used to traverse the elements one by one
			    while(Itr.hasNext())
			    {
			    	System.out.println(Itr.next());
			    
				}
			}
			
		}
		if(n==2)
		{
			System.out.println("Enter the Application name");
			String name=s.next();
			Iterator Itt=list.iterator();//it is used to traverse the elements one by one
		    while(Itt.hasNext())
		    {
		    	String st=(String)Itt.next();
		    	if(st.equals(name))
		    	{
		    		f=1;
		    		break;
		    	}
		    	//System.out.println(Itt.next());
		    
			}
			if(f==1)
			{
				System.out.println("Already installed Application");
			}
			else
			{
				list.add(name);
			System.out.println("Application successfully installed");
			}
		}
		if(n==3)
		{
			if(list.isEmpty()==true)
			{
				System.out.println("There is no application installed\n");
			}
			else
			{
			Iterator It=list.iterator();//it is used to traverse the elements one by one
            for(i=0;i<list.size();i++)		    
              {		    	
            	System.out.println(i+" "+It.next());
              }
		    	System.out.println("Enter the index no to be deleted");
		    	index=s.nextInt();
		    	list.remove(index);
		    	System.out.println("Application uninstalled successfully");
			}
				
		}
		if(n==4)
		{
			System.out.println("Successfully exit");		
         }
		if(n>4)
		{
			System.out.println("Invalid Input");
		}
		
		
		}while(n!=4);
		
	}

}
