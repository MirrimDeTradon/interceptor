package movierental;

import java.util.ArrayList;
import java.util.*;

public class Dispatcher {
    ArrayList<Interceptor> list = new ArrayList<Interceptor>();
    public void Attach(Interceptor interceptor){
        list.add(interceptor);
    }
    public void dispatch(ContextObject co){
        Iterator it = list.iterator();
        while (it.hasNext()){
            Interceptor currentInterceptor = (Interceptor) it.next();
            currentInterceptor.intercept(co);
        }
    }
}
