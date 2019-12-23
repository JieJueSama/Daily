package com.zjx.java2;


/*
 * 		体会四种不同的权限修饰
 * 
 * 
 * 
 */
public class Order {
	
	private int orderPrivate;
	int orderDefault;
	protected int orderProtected;
	public int orderPublic;
	
	private void methodPrivate() {
		orderPrivate = 1;
		orderDefault = 1;
		orderProtected = 1;
		orderPublic = 1;
	}
	
	void methodDefault() {
		orderPrivate = 2;
		orderDefault = 2;
		orderProtected = 2;
		orderPublic = 1;
	}
	
	protected void methodProtected() {
		
	}
	
	public void methodPublic() {
		
	}
	

}
