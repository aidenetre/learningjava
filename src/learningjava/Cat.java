package learningjava;

public class Cat extends Animal{
	
	public Cat(){
		
	}
	
	public String makeSound(){
		
		return "Meow";
		
	}
	
	public static void main(String[] args){
		
		Animal fido = new Dog();
		Animal fluffy = new Cat();
		
		Animal[] theAnimals = new Animal[10];
		
		theAnimals[0] = fido;
		theAnimals[1] = fluffy;
		
		System.out.println("Fido says " + theAnimals[0].makeSound());
		System.out.println("Fluffy says " + theAnimals[1].makeSound());
		
		speakAnimal(fluffy);
		
	}

}
