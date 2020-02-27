package java8.session3.visibility;

class E
{
    private class F
    {
        //inner class
    }
    
    E(){
    	F f = new F();
    }
}
