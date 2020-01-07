package com.zjx.java;

/**
 *      创建三个窗口去卖票，总票数100张   使用继承Thread类的方式
 *
 *      存在线程安全问题
 *
 *
 */

class Window extends Thread{

    private static int ticket = 100;
    @Override
    public void run() {

        while (true){
            if (ticket > 0){
                System.out.println(getName() + ":" + "卖票，票号为" + ticket);
                ticket--;
            }
            else {
                break;
            }
        }

    }
}
public class WindowTest {

    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();


        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");


        w1.start();
        w2.start();
        w3.start();

    }
}