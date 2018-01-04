/**
 * Project Name:dt59homework
 * File Name:Work1.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:34:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import org.apache.log4j.Logger;



/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午2:34:42 <br/>
 * @author   chenyang
 * @version
 * @see
 */

public class Work1 {
   private final static Logger LOG  = Logger.getLogger(Work1.class);
   public static void main(String[] args){
       String str = "my";
       //1.String.length输出字符串长度
       LOG.info(str.length());
       //2.String 的concat连接字符
       str=str.concat("self");
       LOG.info(str);
       //3.替换字符串中的某一个字符
       str = str.replace('s', 'h');
       LOG.info(str);
       //4.删除字符串的前几个字符
       str = str.substring(2);
       LOG.info(str);
       //5.返回一个整数，代表的是指定位置字符的Unicode编码
       LOG.info(str.codePointAt(2));//2代表索引值
       
   }
}

