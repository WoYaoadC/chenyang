/**
 * 
 * @authors ${Chen Yang}
 * @date    2018-01-02 22:10:16
 * @version $Id$
 */
abstract class Pet{
	abstract String eat();
}
class Dog extends Pet{
	String eat(){
		return"小狗在吃骨头";//怎么这句话打印不出来？？？
	}
}
public class Word3{
	public static void main(String[] args) {
		Pet p1 = new Dog();
		p1.eat();
	}
}
