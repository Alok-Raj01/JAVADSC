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

## there is sub variant of if else statement,  
> so in case u want to add multiple if else statements then u can easily add , just repeat the if statement after else here the example see and try it out yourself
```java

if(true){
   // this code will run
}else if(true){
   // This code will run
}else{
    if none conditions are true the this else statement will run 
}


```


# Switch 
switches works the same way but we set all the cases at once then let it runs according to users input 
for example if user enters 1 them hello will print , if user entered 2 then hii will print and till the as manny cases u want , this is made to make the Conditional statement more creat and understandable if the code became too long

> these the flow chart , conditions are made with cases and each case works on a specific input

![flowchart](https://github.com/Alok-Raj01/JAVADSC/blob/main/Srcs/New%20Project%204%20%5B6B3ECA8%5D.png)

> herself the Code and example that will make you understand better...
```java

Switch (variable){ // the variable that will going to have cases on
case 1 : //code1;
     break;
case 1 : // code2;
     break;
default : // code 3 
}

```
> we add break; after each case because if we don't do that , then it will just run all the cases at once

# Arguments
### Use of oprators 
if(condition){} here word condition called as argument , and argument cane be two things at last TRUE or FALSE 
we xan add arguments by any means foe example..
> if(5 > 3)......
> if(age => 18)......
> by this u can use oprators, and if u wanna add 2 statements at a time the eyes is a way
> it's 'and' & 'or' in coding languages we represents and ==> && and we represent or ==> ||, so that's also can be added to add multiple situations ,if u used and then both the statements should be true and if u used or , both of them should be false 
