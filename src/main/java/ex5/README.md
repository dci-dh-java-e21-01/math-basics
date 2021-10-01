# Exercise 5
**5.** Write a Java program to reverse an integer number. (optional)

> adding some limits : reverse only integer of 4 digits

## Inputs :
**int number**
## Output :
**int reversed**

## Steps :
- **Step1 :** read the int number (4 digits)
- **Step2 :** Isolate the last digit in number
    - lastDigit = number % 10
- **Step3 :** Initialise reverse = 0
-  **Step4 :**  reverse = (reverse*10) + lastDigit
- **Step5 :**  number = (number-lastDigit) /10
- **Step6 :**  repeat **Steps 2 to 5**  4 times
- **Step7 :** Print to the Output : reverse

## Demo



      reverseInt(int number :1234){
        lastDigit = number:1234 % 10 --4
	    var reverse = 0
        reverse = reverse:0 *10 + lastDigit:4 --4
	    number = (number:1234 - lastDigit:4) / 10 --123
		    // after 4 rounds
		    // number = 0 , reverse = 4321
    
    return reverse
         
        }
