/**
 * Project Name:dt59homework
 * File Name:Work1_2.java
 * Package Name:hw20180109
 * Date:2018年1月9日下午2:23:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180109;



import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月9日 下午2:23:12 <br/>
 * @author   chenyang
 * @version
 * @see
 */
//方式二：实现接口Runable
class Demo1 implements Runnable{
    private final static Logger LOG = Logger.getLogger(Work1_1.class);
    private String name;
    Demo1(String name){
        this.name = name;
    }
    public void run(){
        for (int i = 1; i <= 10; i++) {
            LOG.info(Thread.currentThread().getName()+"...."+i);
        }
    }
}

public class Work1_2 {
    
   public static void main(String[] args) {
   Demo1 d = new Demo1("m");
//不知道怎么实现第一种方法那样用熊大熊二表示不同的线程
   Thread t1 = new Thread(d);
   Thread t2 = new Thread(d);
   t1.start();
   t2.start();
 
   }
}
