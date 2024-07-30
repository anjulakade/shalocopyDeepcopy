package com.cjc.Deepcopy;

public class Test {

	public static void main(String[] args)
	{
		DeepCopy sh=new DeepCopy();
		System.out.println("ShallowCopy"+sh.x);
		DeepCopy sh21=new DeepCopy();
		System.out.println("ModifiedCoy"+sh21.x);
		  sh21.x=6;
		System.out.println(sh.x);
		
		

	}

}
