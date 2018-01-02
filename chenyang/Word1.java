/**
 * 
 * @authors ${Chen Yang}
 * @date    2018-01-02 21:34:40
 * @version $Id$
 */
abstract class Pet{
	abstract void eat();
}
class Dog extends Pet{
	void eat(){
		System.out.println("狗吃骨头");
	}
}
class Cat extends Pet{
	void eat(){
		System.out.println("猫吃鱼");
	}
}
public class Word1{
	public static void main(String[] args) {
		Pet p1 = new Dog();
		Pet p2 = new Cat();
		method(p1);
		method(p2);
	}
	public static void method(Pet p){
		p.eat();
	}
}
