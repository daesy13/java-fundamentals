package inheritance;

public class Shop extends Business{
    public Shop(String name, String price) {
        super(name, price);
    }

    public String toString(){
        return "Name: " + name + ", Price: " + price + ", Start:" + starRating;
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
