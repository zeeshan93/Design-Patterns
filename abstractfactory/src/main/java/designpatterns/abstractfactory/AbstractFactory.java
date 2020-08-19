/**
 * 
 */
package designpatterns.abstractfactory;


/**
 * @author VKahnZe
 *
 */
public interface AbstractFactory<T> {
	T create(String type);
}
