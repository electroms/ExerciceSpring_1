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
		
		iBatiment ibatiment = (iBatiment) context.getBean("Capitole");
		System.out.println("Batiment en " + ibatiment.composition()
		+ " : " + ibatiment.affiche());
	}

}
