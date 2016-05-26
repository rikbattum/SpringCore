package Spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TraceLogAspect {

	@Around("execution(public * *(..))")
			public Object trace(ProceedingJoinPoint	jp)	throws 	Throwable{
			long curTime =	System.currentTimeMillis();
			Object result =	jp.proceed();
			long time = System.currentTimeMillis() - curTime;
			System.err.println(jp.getStaticPart().getSignature().getName() + " "+ time);
			return
			result;
}
}
