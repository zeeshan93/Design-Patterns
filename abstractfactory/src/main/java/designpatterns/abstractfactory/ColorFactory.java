/**
 * 
 */

package designpatterns.abstractfactory;

/**
 * @author VKahnZe
 */
public class ColorFactory implements AbstractFactory<Color> {

	@Override
	public Color create(String type) {
		if (type.equalsIgnoreCase("RED")) {
			return new Red();
		}
		else if (type.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		else if (type.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		return null;
	}

}
