package inheritance;
//  Each Review should have a body, an author, and a number of stars.
public class Review {
    String bodyText;
    String author;
    int stars;

    public Review(String bodyText, String author, int stars) {
        this.bodyText = bodyText;
        this.author = author;
        this.stars = stars;
    }
}
