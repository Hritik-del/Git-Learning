package main; 
class Parent {
    public void display() {
        System.out.println("Parent");
    }         
}
class Child extends Parent {    
    public void display() {
        System.out.println("Derived");
	System.out.println("Gain Knowledge");
	System.out.println("Gain Pride");
	System.out.println("Cute boy");
	Systemout.println();
	Systemout.println();
	
    }
}
class Cool{
    public static void doDisplay( Parent o ) {
        o.display();   
    }

    public static void main(String[] args) {
        Parent x = new Parent();
        Parent y = new Child();
        Child z = new Child();
        doDisplay(x);
        doDisplay(y);
        doDisplay(z);
    }
}