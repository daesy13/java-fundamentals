package inheritance;
//  Each Review should have a body, an author, and a number of stars.
public class Review {
    public String bodyText;
    public String author;
    public int stars;
    public String movieTitle;
    public Business business;

    public Review(String bodyText, String author, int stars) {
        this.bodyText = bodyText;
        this.author = author;
        this.stars = stars;
        this.movieTitle = null;
    }

    // this an example of polymorphism Method OVERLOADING
    public Review(String bodyText, String author, int stars, String movieTitle) {
        this.bodyText = bodyText;
        this.author = author;
        this.stars = stars;
        this.movieTitle = movieTitle;
    }

    public String toStringReview(){
        return bodyText;
    }

}
