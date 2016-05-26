package Spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.LinkedCaseInsensitiveMap;
import org.w3c.dom.stylesheets.LinkStyle;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		MovieLister listener = context.getBean(MovieLister.class);
	listener.listmovies();
	listener.listTotalMovies();
	}
}
