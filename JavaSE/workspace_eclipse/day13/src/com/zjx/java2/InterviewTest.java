package com.zjx.java2;

import org.junit.Test;

/*
 * 	包装类的提
 * 
 */
public class InterviewTest {
	
	@Test
	public void test1() {
		//编译的时候，类型提升   Integer   提升为  Double  所以为1.0
		Object o1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(o1);//1.0
	}
	
	@Test
	public void test2() {
		Object o2;
		if(true) {
			o2 = new Integer(1);
		}
		else {
			o2 = new Double(2.0);
		}
		
		System.out.println(o2);//1
	}
	
	
	@Test
	public void test3() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);//false
		
		//Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[]，
		//保存了从-128~127范围的整数，如果我们使用自动装箱的方式，给Integr赋值的范围在-128~127范围内
		//可以直接使用数组中的元素，不用再去new了。目的：提高效率
		
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);//true
		
		
		//private static class IntegerCache
		// [-128, 127] 
		Integer x = 128;//相当于 new了一个Integer对象
		Integer y = 128;//相当于 new了一个Integer对象
		System.out.println(x == y);//false
	}

}
