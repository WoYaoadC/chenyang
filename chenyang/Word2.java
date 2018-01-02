/**
 * 
 * @authors ${Chen Yang}
 * @date    2018-01-02 21:58:55
 * @version $Id$
 */
abstract class Pet{
	abstract void eat(String name);
}
class Dog extends Pet{
	void eat(String name){
		System.out.println(name+"在吃骨头");
	}
}
public class Word2{
	public static void main(String[] args) {
		Pet p1 = new Dog();
		p1.eat("小狗");
	}
}