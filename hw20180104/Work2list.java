/**
 * Project Name:dt59homework
 * File Name:Work2.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午4:19:41
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午4:19:41 <br/>
 * @author   chenyang
 * @version
 * @see
 */
public class Work2list {
    private final static Logger LOG = Logger.getLogger(Work2list.class);

    public static void main(String[] args) {
        List list = new ArrayList();
        
        list.add("sdth");//添加第一個字符串數據
        list.add("asef");//添加第二個字符串數據
        list.add("W4TG");//添加第三個字符串數據
        list.add("SDTHt");//添加第四個字符串數據
        list.set(2, "erg");//修改第三個元素
        list.remove(3);//刪除第四個元素
        
       Object arr[] = list.toArray();
       for(int i=0; i<arr.length; i++){
           LOG.info(arr[i]);
           }
       //查詢第二個元素
       LOG.info("第二個元素是："+list.get(1));
        
    }
}

