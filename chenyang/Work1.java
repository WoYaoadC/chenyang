/**
 * 
 * @authors ${Chen Yang}
 * @date    2017-12-29 15:30:17
 * @version $Id$
 */
abstract class Car{//定义一个车的抽象类
	private String name;//品牌属性
	private String kind;//车的类型
	public void summary(String name,String kind){
		System.out.println("这是一个"+name+"的"+kind);
	}
}
class Seden extends Car{//继承类Car
	public Seden(String name,String kind){
		int wheel = 4;//定义一个属性为轮子数
		System.out.println("咱这"+wheel+"个轮子的"+kind+",跑的贼快");
	}
}
class Truck extends Car{
	public Truck(String name,String kind){
		int wheel = 12;
		System.out.println("咱这"+wheel+"个轮子的"+name+kind+",装载量最大");
	}
}
public class Work1{
	public static void main(String[] args) {
		Seden s = new Seden("奥迪","小轿车");
		Truck t = new Truck("江淮","大卡车");

	}
}