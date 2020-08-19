/**
 * 
 */

package designpatterns.abstractfactory;

/**
 * @author VKahnZe
 */
public class AnimalFactory implements AbstractFactory<Animal> {

	@Override
	public Animal create(String type) {
		if (type.equalsIgnoreCase("Duck")) {
			return new Duck();
		}
		else if (type.equalsIgnoreCase("Dog")) {
			return new Dog();
		}
		else if (type.equalsIgnoreCase("Cat")) {
			return new Cat();
		}
		return null;
	}

}
