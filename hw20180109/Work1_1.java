/**
 * Project Name:dt59homework
 * File Name:Work1_1.java
 * Package Name:hw20180109
 * Date:2018年1月9日下午2:22:17
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180109;



import org.apache.log4j.Logger;



/**
 * Description:   <br/>
 * Date:     2018年1月9日 下午2:22:17 <br/>
 * @author   chenyang
 * @version
 * @see
 */
//方式一:继承Thread类
class Demo extends Thread{
    private final static Logger LOG = Logger.getLogger(Work1_1.class);
    private String name;
    //构造又参方法Demo
    Demo(String name){
        this.name = name;
    }
    //覆盖Thread里面的run方法
    public void run(){
        for (int i = 1; i <= 10; i++) {
            LOG.info(name+"...."+i);
        }
    }
}

public class Work1_1 {
    
   public static void main(String[] args) {
   Demo d1 = new Demo("熊大");//将Dome实例化
   Demo d2 = new Demo("熊二");
   d1.start();//调用run方法并开启线程
   d2.start();
   }
}
