/**
 * 
 * @authors ${Chen Yang}
 * @date    2017-12-29 16:28:13
 * @version $Id$
 */
abstract class Car{
	String name;
	String kind;
	public void summary(String name,String kind){
		System.out.println("这是一个"+name+"的"+kind);
	}
}
class Roadster extends Car{
    public void summary(String name,String kind){
    	int maxspeed = 420;
    	System.out.println("我是"+name+kind+"\n我的最高时速是"+maxspeed+"\n你..准备好尖叫了吗？");
    }
}
public class Work3{
	public static void main(String[] args) {
	//有个疑问就是 为什么在作业2中可以以Seden s = new Seden("奥迪","小轿车");这样的形式调用
	//而在这里却不行
		Roadster r = new Roadster();
		r.summary("布加迪威龙","超跑");
	}
}