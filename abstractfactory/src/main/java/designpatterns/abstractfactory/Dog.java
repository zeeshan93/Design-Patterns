/**
 * 
 */
package designpatterns.abstractfactory;


/**
 * @author VKahnZe
 *
 */
public class Dog implements Animal {

	@Override
	public String getAnimal() {
		// TODO Auto-generated method stub
		return "Dog";
	}

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "Bow Bow";
	}

}
