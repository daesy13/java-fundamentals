package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Main method is working!");
    }

    public String name;
    public int starRating;
    public String price;
    public List<Review> reviewList = new ArrayList<>();

    public Restaurant() {
        this.name = name;
        this.price = price;
        this.starRating = 0;
    }

    public void addReview(Review review){
        reviewList.add(review);
        review.restaurant = this;
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
