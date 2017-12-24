/**
 * 
 * @authors ${Chen Yang}
 * @date    2017-12-20 08:53:11
 * @version $Id$
 */
class ren {
    String name;
    double hight;
    int age;
    int weight;
    void human(){
    	System.out.println("我的基本属性就这么多啦");
    }
}
public class Work1{
	 public static void main(String[] args)
	 {
		 ren man = new ren();
		 man.name = "小明";
		 man.hight = 1.75;
		 man.age = 20;
		 man.weight = 56;
		 System.out.println("名字："+man.name+"\n身高："+man.hight+"\n年龄："+man.age+"\n体重："+man.weight);
		 man.human();
	 }
 }