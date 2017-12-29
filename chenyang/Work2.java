/**
 * 
 * @authors ${Chen Yang}
 * @date    2017-12-29 15:30:17
 * @version $Id$
 */
abstract class Car{//定义一个车的抽象类
	String name = "上海大众";//定义实例变量车的品牌
	String kind= "小轿车";//定义实例变量车的类型
	public void summary(String name,String kind){
		System.out.println("这是一个"+name+"的"+kind);
	}
}
class Seden extends Car{
	public Seden(String name,String kind){
		summary(super.name,super.kind);
		int wheel = 4;
		int maxspeed = 280;
		System.out.println("我是"+wheel+"个轮子的"+name+kind+"\n我的最高速度是"+maxspeed+"码"+"\n想不想来感受下？");
	}
}
public class Work2{
	public static void main(String[] args) {
		Seden s = new Seden("奥迪","小轿车");
	}
}