# Exercise 1
**1.** Write a Java program to round up the result of integer division.

## Inputs :
**int num1 , int num2**
## Output :
**int rounded value**

## Steps :
- **Step1 :** read the two integer values num1, num2.
- **Step2 :** calculate result = num1 / num2
- **Step3 :** round result :
  - a. declare variable =   result % 1
  - b. result = result - variable
  - b. if variable >= 0.5 then result += 1
  - c. else  then result +=0
- **Step4 :** Print to the Output : result

## Demo

    roundIntDiv(int v1: 5, int v2: 2){
    var result = v1:5 / v2:2 -- 2.5
    var variable = result:2.5 % 1 -- 0.5
    result = result : 2.5 - variable :0.5 -- 2
    if(variable:0.5 >= 0.5):true then result+=1 -- 3
    else : ignored
    return result : 3 
    }
