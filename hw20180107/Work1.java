/**
 * Project Name:dt59homework
 * File Name:Work1.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午3:07:21
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.io.File;
import java.util.Iterator;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午3:07:21 <br/>
 * 
 * @author chenyang
 * @version
 * @see
 */
public class Work1 {
    private final static Logger LOG = Logger.getLogger(Work1.class);

    public static void main(String[] args) {
        File dir = new File("D:\\java");//指定目录路径
        getAllFiles(dir);
    }

    public static void getAllFiles(File dir) {
        LOG.info("dir" + dir);
        File[] files = dir.listFiles();//获取该目录的文件对象数组
        for (File file : files) {//对数组进行遍历
            if (file.isDirectory()) {//判断是否有目录
                getAllFiles(file);//调取自身功能
            } else {
                LOG.info("file:" + file);
            }
        }
    }
}
