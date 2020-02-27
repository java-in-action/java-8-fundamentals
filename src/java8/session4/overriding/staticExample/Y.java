package java8.session4.overriding.staticExample;

class X
{
    static void methodOfX()
    {
        System.out.println("Class X");
    }
}
 
class Y extends X
{
    @Override
    static void methodOfX()
    {
        System.out.println("Class X");
    }
}