package main.java.ex1;

public class Ex1 {
  public static void main(String[] args) {
    //Demo
    double num1 = 5;
    double num2 =2;
    int roundedValue =  roundIntDiv(num1, num2);
    System.out.println(roundedValue);
  }

  /**
   *
   * @param v1 : double type but integer value
   * @param v2 : double type but integer value
   * @return integer
   */
  public static int roundIntDiv(double v1, double v2){
   // a constraint to the input : should be only integer
    if(v1 % 1 > 0 || v2 % 1 > 0){
      System.out.println("Please input only integers !!!");
      return 0;
    }
    double result = v1 / v2;
    double variable = result % 1;
    result -= variable;
    if (variable >= 0.5){
      result += 1;
    }else{
      result +=0;
    }
    return  (int) result;
  }
}
