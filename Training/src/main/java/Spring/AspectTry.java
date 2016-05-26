package Spring;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectTry {

	@Before("execution(public * listTotalMovies(..))")
	public void before () { 
		System.out.println("Now starting with LISTING Method");
	}	
}
