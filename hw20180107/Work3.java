/**
 * Project Name:dt59homework
 * File Name:Work3.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午4:33:28
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午4:33:28 <br/>
 * 
 * @author chenyang
 * @version
 * @see
 */
public class Work3 {
    private final static Logger LOG = Logger.getLogger(Work3.class);

    public static void main(String[] args) {
        //月份减1，年份减1900
        Date date = new Date(2018 - 1900, 1 - 1, 6);
        //格式化模板
        SimpleDateFormat formater = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str = formater.format(date);
        LOG.info("当前时间是：" + str);
        //获取系统当前时间
        long cur = System.currentTimeMillis();
        Date date2 = new Date(cur);
        //使用格式化的模板格式输出当前系统时间
        LOG.info("当前时间是：" + formater.format(date2));
        Calendar t = Calendar.getInstance();
        LOG.info("今天是："+t.get(Calendar.YEAR)+"年"+(t.get(Calendar.MONTH)+1)+"月"+t.get(Calendar.DAY_OF_MONTH)+"日");
      
    }
}
