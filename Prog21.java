// Another example of abstract class abstract class 
abstract class Parent{
	abstract public void show1();
	
	static void show2(){
		System.out.println("ram2");
	}
	void show3(){
		System.out.println("ram3");
	}//we do not use by createing object
	
}
class Child extends Parent{
	public void show1(){
		System.out.println("ram");
	}
	
}

class Prog21{
public static void main(String ar[]){
Child p=new Child();
Parent.show2();
p.show();

}
}