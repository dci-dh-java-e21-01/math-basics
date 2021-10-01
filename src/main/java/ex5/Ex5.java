package main.java.ex5;

public class Ex5 {
  public static void main(String[] args) {
    //Demo
    int num = 1287;
    int result = reverseInt(num);
    System.out.println(result);
  }

  public static int reverseInt(int number){
    //round 1
    int lastDigit = number % 10;
    int reverse = 0;
    reverse = reverse*10 + lastDigit;
    number = (number - lastDigit) / 10;

    //round 2
    lastDigit = number % 10;
    reverse = reverse*10 + lastDigit;
    number = (number - lastDigit) / 10;

    //round 3
    lastDigit = number % 10;
    reverse = reverse*10 + lastDigit;
    number = (number - lastDigit) / 10;

    //round 4
    lastDigit = number % 10;
    reverse = reverse*10 + lastDigit;
    number = (number - lastDigit) / 10;

    return reverse;
  }
}
