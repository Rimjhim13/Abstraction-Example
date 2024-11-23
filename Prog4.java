//Abstraction
abstract class Vehicle{
	abstract  void stop();
	abstract   void run();
	abstract  void wheels();
}
class car extends Vehicle {
	 void stop(){
		System.out.println("Stop the car");
		
	}
	 void run(){
		System.out.println("run the car");
	}
	 void wheels(){
		System.out.println("car have 4 wheels");
	}
}
class Prog4{
	public static void main(String ar[]){
		car c=new car();
		c.stop();
		c.run();
		c.wheels();
	}

}