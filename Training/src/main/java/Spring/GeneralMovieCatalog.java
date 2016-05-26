package Spring;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class GeneralMovieCatalog implements MovieCatalogue{

	public List<String> getMovieCatalog() {
		List <String> movies = new ArrayList <String> () ;
		movies.add(" film 1");
		movies.add(" film 2");
		movies.add(" film 3");
		return movies;
	}

}
