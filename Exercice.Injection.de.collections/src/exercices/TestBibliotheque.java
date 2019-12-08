/**
 * 
 */
package exercices;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Pierre-Henry Barge
 *
 */
public class TestBibliotheque {

		public static void main(String[] args) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bibliotheque.xml");

			Bibliotheque livres = (Bibliotheque) context.getBean(Bibliotheque.class);

			livres.affiche();

			context.close();
		}

}
