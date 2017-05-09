package GonsalvesU2;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;


public class DataInterceptor {

    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception {
        System.out.println(" !!! интерсептор был вызван !!!! ");
            return ic.proceed();
    }
}
