/**
 * 
 * @authors ${Chen Yang}
 * @date    2017-12-27 14:59:51
 * @version $Id$
 */
class Chen{
	String name ;
	int age ;
	char gender;
	void setChen(String a,int b,char c){
          name = a;
          age = b;
          gender = c;
          System.out.println("name:"+name+"\nage:"+age+"\ngender:"+gender);
	}
}
public class Work3{
	public static void main(String[] args) {
		Chen c = new Chen();
		c.setChen("陈洋",24,'男');
	}
}