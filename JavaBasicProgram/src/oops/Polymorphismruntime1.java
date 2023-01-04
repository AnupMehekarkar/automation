package oops;

class Animal100 {
	void eat() {
		System.out.println("Animals Eat");
	}
}
class herbivores extends Animal100 {
	void eat() {
		System.out.println("Herbivores Eat Plants");
	}
}
class omnivores extends Animal100 {
	void eat() {
		System.out.println("Omnivores Eat Plants and meat");
	}
}
class carnivores extends Animal100 {
	void eat() {
		System.out.println("Carnivores Eat meat");
	}
}
public class Polymorphismruntime1 {

	public static void main(String[] args) {
		
		Animal100 A = new Animal100();
		A.eat();// Animals Eat
		Animal100 h = new herbivores(); // 
		h.eat();// 
		Animal100 o = new omnivores(); // 
		o.eat();// 
		Animal100 c = new carnivores(); // 
		c.eat();//
	}

}
/*When a method gets to know its implementation at the time of execution/rum time is known as run
* time poly this can be achieved by using method overriding
* 1. Inheritance
* 2. Upcasting
* 3. Method Overriding
*/
