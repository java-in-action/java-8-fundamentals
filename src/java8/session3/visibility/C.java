package java8.session3.visibility;

public class C
{
    protected int i;
}
 
class D extends C
{
     public void method(){
    	 System.out.println(i);
     }
}