/**
 * 
 */
package designpatterns.abstractfactory;


/**
 * @author VKahnZe
 *
 */
public class Duck implements Animal {

	@Override
	public String getAnimal() {
		// TODO Auto-generated method stub
		return "Duck";
	}

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "Quack Quack";
	}

}
