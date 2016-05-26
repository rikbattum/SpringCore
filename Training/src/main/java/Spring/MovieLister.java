package Spring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieLister {

	@Autowired
	@Action
	private MovieCatalogue movieCatalog;
	@Autowired
	private Map<String, MovieCatalogue> allCatalogs;

	public void listmovies() {

		List<String> y = movieCatalog.getMovieCatalog();
		System.out.println(y);
	}

	public void listTotalMovies() {
		for (String key : allCatalogs.keySet()) {
			System.out.println(key);
			for (String title : allCatalogs.get(key).getMovieCatalog()) {
				System.out.println(">" + title);
			}
		}
	}
}
