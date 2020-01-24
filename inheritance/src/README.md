# LAB 6 Composition and Inheritance, Part 1
[LINK TO CODE](https://github.com/daesy13/java-fundamentals/tree/master/inheritance/src/main/java/inheritance)</br>
[LINK TO TEST](https://github.com/daesy13/java-fundamentals/tree/master/inheritance/src/test/java/inheritance)
# Lab Summary
* Create a main class for a restaurant.
* Create a constructor with the information necessary for each restaurant instance.
* Create a method for review.
* Create a method addReview that adds the ratings and gives an average.
* Each review should know at which restaurant belongs.

## Lab Description
1. Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).</br>
  * Implement a Restaurant constructor.
  * Test that your Restaurant constructor is behaving reasonably.
  * Implement a reasonable toString method for Restaurants.
  * Write a test to create an instance of Restaurant and ensure that its toString is working properly.
2. Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
  * Write a Review constructor.
  * Test that your constructor is working reasonably.
  * Implement a reasonable toString method for Reviews.
  * Write a test to create an instance of Review and ensure that its toString is working properly.
3. A Review should be about a single Restaurant. Choose an implementation for this, and implement it. Some considerations:
  * Should a Review know which Restaurant it is about?
  * Should a Restaurant know which Reviews are about it?
  * Is a Restaurant a special type of Review? Is a Review a special type of Restaurant? Is there common functionality that unites them?
  * Update your toString and constructor methods appropriately, and also update your testing code to test this new functionality.
4. Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant. The specific methodology for this will vary, depending on the implementation you chose above.
  * Add tests to ensure that when you call addReview, the association is created between the Restaurant and the Review.
5. When you associate a review with a restaurant, that restaurant’s star rating should change. Ensure that your addReview method updates the Restaurant star rating appropriately, and add tests. (In particular, ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.)