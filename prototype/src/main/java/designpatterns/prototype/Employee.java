/**
 * 
 */

package designpatterns.prototype;

/**
 * @author VKahnZe
 */
public class Employee implements Prototype {

	private String id;

	private String name;

	private String dob;

	private String mob;

	private String emailId;

	public Employee(String id, String name, String dob, String mob,
		String emailId)
	{
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.mob = mob;
		this.emailId = emailId;
	}

	public void showRecord() {
		System.out.println("id : " + id + " name : " + name + " dob :" + dob +
			" mob :" + mob + " emailId : " + emailId);
	}

	public Prototype getClone() {
		return new Employee(id, name, dob, mob, emailId);
	}

}
