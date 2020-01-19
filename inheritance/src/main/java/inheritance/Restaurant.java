package inheritance;

import java.util.List;

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Main method is working!");
    }

    public String name;
    public int starRating;
    public String price;
    public List<Review> reviewList;

    public Restaurant(String name, String price) {
        this.name = name;
        this.price = price;
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
