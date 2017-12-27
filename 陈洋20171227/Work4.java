/**
 * 
 * @authors ${Chen Yang}
 * @date    2017-12-27 15:52:58
 * @version $Id$
 */
class Dog{
	String name;
	int age;
	String kind;
   public Dog(String name){
      System.out.println("名字是："+name);
	}
	public Dog(String name,int age){
      System.out.println("名字是:"+name+"\n年龄:"+age);
	}
	 public Dog(String name,int age,String kind){
      System.out.println("名字是:"+name+"\n年龄:"+age+"\n种类:"+kind);
	}
}
public class Work4{
	public static void main(String[] args) {
		new Dog("大黄");
		new Dog("大白",3);
		new Dog("大胖",3,"中华田园犬");
	}
}