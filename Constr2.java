// constructor

import java.io.*;

class Constr2
 {
	int num;
	String name;

      Constr2()
 { 
      System.out.println("Constructor called");
 }
}

class GFG 
 {
	public static void main(String[] args)
	{
		Constr2 cns = new Constr2();

		System.out.println(cns.name);
		System.out.println(cns.num);
	}
}
