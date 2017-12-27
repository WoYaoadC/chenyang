/**
 * 
 * @authors ${Chen Yang}
 * @date    2017-12-27 15:25:48
 * @version $Id$
 */
public class Work2{
	String lionName = "大王";
	int lionAge = 5;
	String lionColor = "黄色";
void lion(){
		String lionName = "辛巴";
	    int lionAge = 6;
	    String lionColor = "白色";
		System.out.println("名字是："+lionName+"\n年龄是:"+lionAge+"\n颜色:"+lionColor);
	}
    public static void main(String[] args) {
    	Work2 work = new Work2();
    	work.lion();
    }
	
}
