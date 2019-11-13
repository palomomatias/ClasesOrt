package test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist_inverso {

	public static void main(String[] args) {
		ArrayList<String> nombres=new ArrayList<String>();
		nombres.add("A");
		nombres.add("B");
		nombres.add("C");
		Collections.reverse(nombres);
			for(String i:nombres)
			{
				
				System.out.println(i);
			}
	}

}
