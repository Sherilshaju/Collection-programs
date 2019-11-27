package casestudy;

public class Custom {
	String ac,cot,wifi,laundry,cable;
	int a,b,c,d,e,total=0;
	public double calc()
	{
		if(ac=="Y")
		{
			a=750;
		}
		else
		{
			a=500;
		}
		if(cable=="Y")
		{
			b=100;
		}
		else
		{
			b=0;
		}
		if(wifi=="Y")
		{
			c=100;
		}
		else
		{
			c=0;
		}
		if(cot=="2")
		{
			d=200;
		}
		else if(cot=="1")
		{
			d=100;
		}
		return total=a+b+c+d;
	}

}
