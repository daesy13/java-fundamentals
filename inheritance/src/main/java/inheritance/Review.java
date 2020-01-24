package inheritance;
//  Each Review should have a body, an author, and a number of stars.
public class Review {
    public String bodyText;
    public String author;
    public int stars;
    public Restaurant restaurant;

    public Review(String bodyText, String author, int stars) {
        this.bodyText = bodyText;
        this.author = author;
        this.stars = stars;
    }

    public String toStringReview(){
        return bodyText;
    }

}
