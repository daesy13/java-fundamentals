package inheritance;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Theater extends Business{
    // name
    // starRating = 0
    // price
    // reviewList -> empty list

    public HashSet<String> moviesPlaying;

    public Theater(String name, String price) {
        super(name, price);
        moviesPlaying = new HashSet<>();
    }

    public String toString(){

        return "Name: " + name + ", Price: " + price + ", Start:" + starRating + " Movie: " + moviesPlaying;
    }

    // add movie method that will add movies and remove movies.
    public void addMovie(String movieTitle){
        moviesPlaying.add(movieTitle);
    }

    public void removeMovie(String movieTitle){
        if (this.moviesPlaying.contains((movieTitle))){
            this.moviesPlaying.remove(movieTitle);
        }
        moviesPlaying.remove(movieTitle);
    }

    public void addReview(Review review){
        reviewList.add(review);
        review.business = this;
        updateStars();
    }

    private void updateStars() {
        int sum = 0;
        for (Review review: reviewList){
            sum += review.stars;
        }
        starRating = sum/reviewList.size();
    }

}
