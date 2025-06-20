# Conditional statements 
this types of statements helps us to add condition on our data , for example :
if the age of the user is more then 18 then print "you are an adult" or id it's not true then print 
"you are not an adult"
This can be divid into 3 types: 
1. if statement
2. if else statements
3. switch

# If statement :
here's the flow chart,  help u to understand 
![Cool Image](https://github.com/Alok-Raj01/JAVADSC/blob/main/Srcs/New%20Project%202%20%5B38510E2%5D.png)
if the condition is true then the code in statement will run else the statement will skip 
```java

if(true){
 System.out.print("it's true");
}
```
---
# If else statements
this type provides us a feature to Run a code if statement is false too
if the statement is true the u can ran a set of code and its it's not true u can ran a different ste of code 
here's the flow chart and example u will find help full
![if else flow ](https://github.com/Alok-Raj01/JAVADSC/blob/main/Srcs/New%20Project%203%20%5B9070275%5D.png)

> Here's the example u can understand better ,in this example the there are two user and lets make a age r3lated program to understand things better

```java
int User1Age = 16
int User2Age = 21

// let's see with user one
if(User1Age >= 18 ){
System.out.print("you are an adult");
} else {
 System.out.print("you are not an adult");
}
// In case of User1Age the output will be , u are not an adult
//but in case of User2Age the output will be , u r an adult 
```
