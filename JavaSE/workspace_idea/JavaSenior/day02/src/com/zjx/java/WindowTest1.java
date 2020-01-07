package com.zjx.java;
/**
 *      创建三个窗口去卖票，总票数100张   使用实现Runnable接口的方式
 *
 *     问题：重票和错票  线程安全问题
 *     问题出现原因：当某个线程操作车票的过程中，尚未完成操作，其他线程参与进来，也操作车票
 *     如何解决：当一个线程在操作共享数据的时候，其他线程不能参与进来，直到该线程完成操作，其他线程才可以开始操作，这种情况即使该操作出现了阻塞，也不能被改变
 *
 *     在Java中，我们通过同步机制，来解决线程的安全问题
 *
 *
 *     方式一：同步代码块
 *
 *     synchronized(同步监视器){
 *         //需要被同步的代码
 *
 *
 *     }
 *     说明：操作共享数据的代码，即为需要被同步的代码
 *          共享数据：多个数据共同操作的变量，比如：ticket就是共享数据
 *          同步监视器：俗称：锁。任何一个类的对象，都可以充当锁
 *                  要求：多个线程必须要共用一把锁
 *
 *
 *     方式二：同步方法
 *
 *
 */

class Window1 implements Runnable{

    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while(true){
            synchronized(obj){
                if (ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "卖票，票号" + ticket);

                    ticket--;
                }
                else {
                    break;
                }
            }

        }

    }
}

public class WindowTest1 {

    public static void main(String[] args) {

        Window1 w1 = new Window1();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.start();
        t2.start();
        t3.start();
    }
}
