/**
 * 
 * @authors ${Chen Yang}
 * @date    2017-12-27 17:31:23
 * @version $Id$
 */
class person{
	static int age=12;
	String name = "萨尔";
	void yourname(String name){
		System.out.println("name为"+name);
	}
	static void yourage(int age){
		System.out.println("age为"+age);
	}
}
public class Work6{
	public static void main(String[] args) {
		person p = new person();
		p.yourname("萧瑟");
		person.yourage(11);
		System.out.println(p.name);
		System.out.println(person.age);
	}
}