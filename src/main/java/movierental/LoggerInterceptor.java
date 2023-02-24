package movierental;

public class LoggerInterceptor implements Interceptor {
    public void intercept(ContextObject contextObject){
        System.out.println(contextObject.getMovieTitle());
    }
}
