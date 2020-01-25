package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Business {
    public String name;
    public int starRating;
    public String price;
    public List<Review> reviewList;

    public Business(String name, String price){
        this.name = name;
        this.price = price;
        this.starRating = 0;
        this.reviewList = new ArrayList<>();
    }

}
