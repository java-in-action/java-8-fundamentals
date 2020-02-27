package java8.session4.overriding.constructors;

class A
{
	
	// 1
    public A(int i)
    {
        System.out.println(1);
    }
     
    public A()
    {
        this(10); //
    	System.out.println("public A");
        System.out.println(2);
    }
    
    void A()
    {
        A(10);
         
        System.out.println(3);
    }
     
    void A(int i)
    {
        System.out.println(4);
    }    
}
 
 // 1, 2, 4 y 3
public class MainClass1 
{   
    public static void main(String[] args)
    {
        new A().A();
    }
}