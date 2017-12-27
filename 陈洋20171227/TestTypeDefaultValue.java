/**
 * 
 * @authors ${Chen Yang}
 * @date    2017-12-27 14:06:07
 * @version $Id$
 */
 class TypeDefaultValue{
	 byte a;//byte类型的默认值为0
	short b;//short类型的默认值为0
	int c;//int类型的默认值为0
	long d;//long类型的默认值为0
	float e;//float类型的默认值为0.0
	double f;//byte类型的默认值为0.0
	boolean g;//boolean类型的默认值为false
	char h;//char类型的默认值为NUL
	String i;//String类型的默认值为null
	int[] j;//int[]类型的默认值为null
 }
 public class TestTypeDefaultValue{
   public static void main(String[] args) {
   	TypeDefaultValue t = new TypeDefaultValue();
   	  System.out.println(t.a+" "+t.b+" "+t.c+" "+t.d+" "+t.e+" "+t.f+" "+t.g+" "+t.h+" "+t.i+" "+t.j);
   }
}