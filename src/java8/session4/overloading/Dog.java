package java8.session4.overloading;

class Dog{
    public void bark(){
        System.out.println("woof ");
    }
    
    //overloading method
    public void bark(int num){
    	for(int i=0; i<num; i++)
    		System.out.println("woof ");
    }
}