package designpatterns.abstractfactory;

public class AbstractfactoryApplication {

	public static void main(String[] args) {
		
		AbstractFactory<Animal> animalFactory = FactoryProvider.getFactory("Animal");
		Animal Dog = animalFactory.create("Dog");
		System.out.println(Dog.getAnimal());
		
		System.out.println(Dog.makeSound());
		
		AbstractFactory<Color> colorFactory = FactoryProvider.getFactory("Color");
		Color red = colorFactory.create("Red");
		
		System.out.println(red.getColor());
	}
	
}
