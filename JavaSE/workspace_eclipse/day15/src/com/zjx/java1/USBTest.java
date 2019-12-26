package com.zjx.java1;
/*
 * 	接口的使用
 * 
 * 	1.接口的使用上满足多态性
 * 	2.接口，实际上就是定义了一种规范
 * 	3.开发中，体会面向接口编程
 * 
 */
public class USBTest {
	
	
	public static void main(String[] args) {
		
		Computer com = new Computer();
		//1.创建了接口的非匿名实现类的非匿名对象
		Flash flash = new Flash();
		com.transferData(flash);
		
		//2.创建了接口的非匿名实现类的匿名对象
		com.transferData(new Printer());
		
		//3.创建了接口的匿名实现类的非匿名对象
		USB phone = new USB() {
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("phone start");
			}
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("phone stop");
			}
		};
		com.transferData(phone);
		
		//4.创建了接口的匿名实现类的匿名对象
		com.transferData(new USB() {

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("no name start");
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("no name stop");
			}
			
		});
		
		
		
	}
	
	
	
	
	
	
	
	

}


//规范
interface USB{
	
	//定义了 长、款、最大最小的传输速度
	
	void start();
	
	void stop();
}

class Computer {
	public void transferData(USB usb) {
		usb.start();
		
		System.out.println("xxxxxx");
		
		usb.stop();
	}
}

class Flash implements USB{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Flash start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Flash stop");
	}
	
}

class Printer implements USB{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Printer start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Printer stop");
	}
	
}
