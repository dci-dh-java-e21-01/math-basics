package main.java.ex11;

public class Ex11 {
  public static void main(String[] args) {
    //Demo
    // A prime number cannot be divided by any other numbers
    // without leaving a remainder
    // (1 is excluded and the number itself  )
    int number = 7;
    if(number % 2 == 0 || number % 3 == 0 ){
      System.out.println("Number : "+number+" is not a Prime number");
    }else{
      System.out.println("Number :"+number+" is a Prime number");

    }

    // count number of Primes till number = 7
    int count = 0; // count is the number of primes
    // is 3 A PRIME
    if(3 % 2 != 0 ){
      count++;
    }
    // is 4 A PRIME
    if(4 % 2 != 0 && 4 % 3 !=0 ){
      count++;
    }

    // is 5 A PRIME

    if(5 % 2 != 0 && 5 % 3 !=0 && 5 % 4 !=0 ){
      count++;
    }

    // is 6 A PRIME

    if(6 % 2 != 0 && 6 % 3 !=0 && 6 % 4 !=0 && 6 % 5 !=0 ){
      count++;
    }

    // is 7 A PRIME

    if(7 % 2 != 0 && 7 % 3 !=0 && 7 % 4 !=0 && 7 % 5 !=0 && 7 % 6 !=0){
      count++;
    }

    System.out.println(count);
  }
}
