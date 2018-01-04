/**
 * Project Name:dt59homework
 * File Name:Work2map.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午6:35:15
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午6:35:15 <br/>
 * @author   chenyang
 * @version
 * @see
 */
public class Work2map {
    public final static Logger LOG = Logger.getLogger(Work2map.class);   
    public static void main(String[] args) {
       Map<Integer,String> map = new HashMap<Integer,String>();
       methodMap(map);
       
       
}
   public static void methodMap(Map<Integer,String> map){
       map.put(3, "王霸");//添加数据
       map.put(5, "刘忙");//添加数据
       map.put(7, "老王");//添加数据
       LOG.info(map);//遍历数据
       LOG.info(map.remove(5));//删除数据
       LOG.info(map);//查看删除之后的变化
       map.put(3,"王瑟");//修改数据
       LOG.info(map);//查看修改之后的变化
       LOG.info(map.get(7));//查询键值为7的数据
       
   }
   
}

