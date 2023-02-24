package movierental;

public class ContextObject {
    Movie movie;
    public ContextObject(Movie movie){
        this.movie = movie;
    }
    public String getMovieTitle(){
        return this.movie.getTitle();
    }
}
