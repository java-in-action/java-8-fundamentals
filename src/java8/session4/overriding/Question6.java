package java8.session4.overriding;

class X1
{
    void method(int a)
    {
        System.out.println("ONE");
    }
     
    void method(double d)
    {
        System.out.println("TWO");
    }
}
 
class Y extends X1
{
    @Override
    void method(double d)
    {
        System.out.println("THREE");
    }
    

    void method(long l)
    {
        System.out.println("FOUR");
    }    
}
 
public class Question6 
{   
    public static void main(String[] args)
    {
    	long val = 100; // 100.0
    	
        new X1().method(val);
    }
}