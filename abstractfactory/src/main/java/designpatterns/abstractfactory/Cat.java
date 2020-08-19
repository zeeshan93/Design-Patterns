/**
 * 
 */
package designpatterns.abstractfactory;


/**
 * @author VKahnZe
 *
 */
public class Cat implements Animal {

	@Override
	public String getAnimal() {
		// TODO Auto-generated method stub
		return "Cat";
	}

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "Meow Meow";
	}

}
