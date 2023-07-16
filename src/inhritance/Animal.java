package inhritance;
//first class declare
public class Animal {
		   String name;
		   int age;

		   public void eat() {
		      System.out.println("The animal is eating.");
		   }
		}

class Dog extends Animal {
		   

		   public void bark() {
		      System.out.println("The dog is barking.");
		   }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Dog obj=new Dog();
       obj.eat();
       obj.bark();
	}

}
