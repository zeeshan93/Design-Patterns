/**
 * 
 */
package designpatterns.prototype;


/**
 * @author VKahnZe
 *
 */
public class PrototypeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("First Object is ==>> ");
		Employee e1 = new Employee("1", "User", "01/01/2020", "1234567890", "email@email.com");
		
		e1.showRecord();
		
		Employee e2 = (Employee) e1.getClone();
		
		System.out.println("Cloned Object is ==>> ");
		e2.showRecord();

	}

}
