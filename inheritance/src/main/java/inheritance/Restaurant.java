package inheritance;

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Main method is working!");
    }

    String name;
    int stars;
    long price;

    public Restaurant(String name, int stars, long price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

//    public void addReview(String args){
//        return args;
//    }


}
