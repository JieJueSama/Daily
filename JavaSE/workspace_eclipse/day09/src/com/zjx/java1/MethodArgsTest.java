package com.zjx.java1;
/*
 * 		可变个数形参的方法
 * 
 * 		1.JDK5.0新增的内容
 * 		2.具体使用
 * 			2.1可变个数形参的格式：数据类型  ... 变量名
 * 			2.2当调用可变个数参数形参的方法时，传入的参数个数可以是：0 1 2 
 * 			2.3可变个数形参方法与本类中方法名相同，形参不同的方法之间构成重载
 * 			2.4可变个数形参方法与本类中方法名相同，形参类型也相同的数组不能共存，不构成重载
 * 			2.5可变个数形参在方法的形参中，必须声明在末尾
 * 			2.6可变个数形参在方法的形参中，最多只能声明一个可变形参
 */
public class MethodArgsTest {
	
	public static void main(String[] args) {
		
		MethodArgsTest test = new MethodArgsTest();
		test.show(12);
		
		test.show("hello");
		
		test.show("haha","heihei");
		
		test.show();
	}

	
	
	public void show(int i) {
		
	}
	
	public void show(String s) {
		System.out.println(s);
	}
	
	public void show(String ... strs) {
		System.out.println("strs");
		
		for(int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]);
		}
		System.out.println();
	}
	
//	public void show(String[] strs) {
//		
//	}
	
//	public void show(String ...strings, int i) {
//		
//	}
	
}
