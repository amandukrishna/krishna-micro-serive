package com.deloitte.training;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		
		
		A aq=new A();
		Method[] m=aq.getClass().getMethods();
		for(int i=0; i<m.length;i++) {
			
			if("m2".equals(m[i].getName()))
			System.out.println(m[i].invoke(aq));
		}
	}

}
