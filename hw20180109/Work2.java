/**
 * Project Name:dt59homework
 * File Name:Work2.java
 * Package Name:hw20180109
 * Date:2018年1月9日下午3:09:45
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180109;



import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月9日 下午3:09:45 <br/>
 * @author   chenyang
 * @version
 * @see
 */
class Demo2 implements Runnable{
    private final static Logger LOG = Logger.getLogger(Work1_1.class);
    private String name;
    Demo2(String name){
        this.name = name;
    }
    public void run(){
        for (int i = 1; i <= 10; i++) {
            LOG.info(Thread.currentThread().getName()+"...."+i);
        }
    }
}

public class Work2 {
    
   public static void main(String[] args) {
   Demo2 d = new Demo2("sdr");
//不知道怎么实现第一种方法那样用熊大熊二表示不同的线程
   Thread t1 = new Thread(d);
   Thread t2 = new Thread(d);
   t1.start();
   t2.start();
   t1.setPriority(Thread.MAX_PRIORITY);//将t1线程设置最高优先级
   t2.setPriority(Thread.MIN_PRIORITY);//将t2线程设置最高优先级
   }
}


