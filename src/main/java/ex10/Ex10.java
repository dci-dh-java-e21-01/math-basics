package main.java.ex10;

public class Ex10 {
  public static void main(String[] args) {
    // Demo
    int random1 = 15;
    int random2 = 25;
    int random3 = 10;
    int random4 = 5;
    System.out.println(check15(45,30));
  }
  public static boolean check15(int num1, int num2){
    int sum = num1 + num2;
    int difference1 = num1 - num2;
    int difference2 = num2 - num1;
    if(num1 == 15 || num2 == 15 || difference1 == 15 || difference2 == 15 || sum == 15  ) {
      return true;
    }else{
      return false;
    }
  }
}
