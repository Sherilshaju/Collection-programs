package Set;

import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class HashsetCase_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String symbol;
		int num,count=0;
Scanner s=new Scanner(System.in);
Set<NewCard> set1=new TreeSet<NewCard>(new Symbol());
NewCard[] c=new NewCard[40];
System.out.println("Enter the number of symbols");
int n=s.nextInt();
while(set1.size()<n)
{
	//System.out.println("Ente")
	symbol=s.next();
	num=s.nextInt();
	c[count]=new NewCard();
	c[count].setSymbol(symbol);
	c[count].setNum(num);
	set1.add(c[count]);
	count++;
	
}
System.out.println(n+" Symbols gathered in "+count+" cards");
System.out.println("cards are:");
Iterator<NewCard> Itr=set1.iterator();//it is used to traverse the elements one by one
while(Itr.hasNext())
{
	NewCard ca=(NewCard)Itr.next();
	System.out.println(ca.getSymbol()+" "+ca.getNum());

}
	}

}
