import java.time.LocalDateTime;  

public class Main {
  public static void main(String[] args){
    System.out.println("Main method is working!");

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(2);

    Main object = new Main();
		object.clock();
  }

  // pluralize 
  // Write a function called pluralize that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.
  public static String pluralize(String elem, int num){
    if (num != 1){
      return elem + 's';
    }
    else {
      return elem;
    }
  }

  // Flipping Coins
  // Write a function called flipNHeads that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row. took FLIPS flips to flip N heads in a row. once n heads have been in a row.
  public static void flipNHeads(int num){
    int count = 0;
    int countHeads = 0;
    String result;
    while (countHeads != num){
      
    double randgen = Math.random();
      if (randgen < .5){
        result = "tail";
        System.out.println(result);
        count++;
      } else {
        result = "heads";
        System.out.println(result);
        count++;
        countHeads++;
      } 
    }
    System.out.println("It took " + count + " " + pluralize("flip", count) + " to flip " + num + " " + pluralize("head", num) + " in a row.");
  }

  // Write a method clock that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.
  // Zero-pad single digit numbers as strings so the timestamp is always the same number of characters.

 

  private synchronized void clock() {

		while (true) {
      LocalDateTime now = LocalDateTime.now();
      int hour = now.getHour();
      int minute = now.getMinute();
      int second = now.getSecond();
			System.out.println(String.format("%d:%d:%d", hour, minute, second));
			try {
				this.wait(1000);
			} catch (InterruptedException t) {
 
				t.printStackTrace();
			}
		}
	}
}


  

