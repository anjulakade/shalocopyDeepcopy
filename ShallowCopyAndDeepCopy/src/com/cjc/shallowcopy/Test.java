package com.cjc.shallowcopy;

public class Test {

	public static void main(String[] args)
	{
		ShallowCopy sh=new ShallowCopy();
		System.out.println("ShallowCopy"+sh.x);
//		ShallowCopy sh2=new ShallowCopy();
		ShallowCopy sh21=sh;
		System.out.println("ModifiedCoy"+sh21.x);
		  sh21.x=6;
		
		System.out.println(sh.x);
		
		

	}

}
