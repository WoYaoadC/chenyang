/**
 * 
 * @authors ${Chen Yang}
 * @date    2017-12-27 16:52:51
 * @version $Id$
 */
class petCat{
	private String name;
	private int age;
	private char gender;
	public void setName(String name){
         this.name = name;
	}
	public void getName(){
		System.out.println("名字是："+name);
	}
	public void setAge(int b){
         age = b;
	}
	public void getAge(){
		System.out.println("多大了："+age);
	}
	public void setGender(char c){
        gender = c;
	}
	public void getGender(){
		System.out.println("公的母的？"+gender);
	}

}
public class Work5{
	public static void main(String[] args) {
		petCat p = new petCat();
		p.setName("小白");
		p.getName();
		p.setGender('母');
		p.getGender();
		p.setAge(2);
		p.getAge();
		System.out.println("ok，都暴露啦");
	}
}