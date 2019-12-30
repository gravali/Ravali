package dec17.com;

import java.util.ArrayList;
import java.util.Iterator;

public class Using_Iterator {

	public static void main(String[] args) {
		ArrayList<String>days=new ArrayList<String>();
		days.add("sun");
		days.add("mon");
		days.add("tue");
		days.add("wed");
		days.add("thu");
		days.add("fri");
		days.add("sat");
		Iterator<String>x=days.iterator();
		while(x.hasNext())
		{
			System.out.println(x.next());
		}

	}

}
