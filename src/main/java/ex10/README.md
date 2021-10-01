# Exercise 10
**10.** Write a Java program to accept two integers and return true if the either one is 15 or if their sum or difference is 15.


## Inputs :
**int num1 , int num2**
## Output :
**boolean flag**

## Steps :
- **Step1 :** read the int num1, int num2
- **Step2 :** if either one is 15 then return true => last step
    - if (num1 equal 15  ||  num2 equal 15)  {
      return true
      }

- **Step3 :** if their sum or difference is 15 then return true  => last step
    - else if (num1 + num2 equal 15  ||  num1 - num2 equal 15 || num2 - num1 equal 15 )  {
      return true
      }
-  **Step4 :**  Else return false
    - else { return false }
-
- **Step5 :** End 
