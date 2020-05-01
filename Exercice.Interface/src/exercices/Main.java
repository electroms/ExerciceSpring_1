/**
 * 
 */
package exercices;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] arguments) {
		context = new ClassPathXmlApplicationContext("Propriete.xml");

		Propriete propriete1 = (Propriete) context.getBean("propriete1Bean");
		propriete1.affiche();

		Propriete propriete2 = (Propriete) context.getBean("propriete2Bean");
		propriete2.affiche();
	}

}
