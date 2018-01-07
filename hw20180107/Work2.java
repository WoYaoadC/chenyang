/**
 * Project Name:dt59homework
 * File Name:Work2.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午3:17:28
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 下午3:17:28 <br/>
 * @author   chenyang
 * @version
 * @see
 */
public class Work2 {
public static void main(String[] args) throws IOException {
    copyText();//调用copyText()放法
}
public static void copyText() throws IOException{
    //读入指定目录文件
    FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\practice\\Bus.java");
    //写入指定目录文件
    FileWriter fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\practice\\\\cope_2.txt");
    char[] buf = new char[1024];//设置cope_2.txt文件的字节长度
    int len = 0;//设置初始长度
    while((len=fr.read(buf))!=-1) {
        fw.write(buf,0,len);
     }
    //释放资源
    fw.close();
    fr.close();
}
}

