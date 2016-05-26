package Spring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Action
public class ActionMovieCatalog implements MovieCatalogue {

	public List<String> getMovieCatalog() {
		List<String> movies = new ArrayList<String>();
		movies.add(" Action movie 1");
		movies.add(" Action movie 2");
		movies.add(" Action Movie 3");
		return movies;
	}

}
