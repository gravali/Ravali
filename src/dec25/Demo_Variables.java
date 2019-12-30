package dec25;

public class Demo_Variables {
	int a,b,c;
	double x,y,z;
	public void add()
	{
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
	public void div()
	{
		x=456;
		y=25;
		z=x/y;
		System.out.println(z);
		
	}

	public static void main(String[] args) {
		Demo_Variables d=new Demo_Variables();
		d.add();
		d.div();

	}

}
