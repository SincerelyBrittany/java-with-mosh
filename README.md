# java-with-mosh

### Java for VSCode

https://code.visualstudio.com/docs/languages/java


### Understanding Functions

1. How functions look in Java

```
ReturnType Name() {

}

```

2. You could use void for the return type and the function name should be specific & left brace stays on the same line as you define your function.


```
void sendEmail() {

}

```

3. Understanding the MAIN function - the entry point for Java program - the code inside that function gets executed - main should always. Every Java program should have at least 1 function (Main). Main is the entry point to our programs whenever we execute java program and the code inside the main function gets executed. Fucntions do not exist on their own, they should always belong to a class. 

4. A class is a continer for one or more related function. Basically we use these calsses to organize out code. Like sections in a grocery stoer with prodycts. 

5. Every Java program should have at least one class that contains the main function

``` 
class Main {
    void main() {

    }
}
```

6. A method is a function that is part of a class. In some other languages we can have a function that exist outside of class. But when a function belongs to a class we refer to it as a method of that class. 

7. In Java, calsses and methods should have an ``access modifier``. An access modifier is a special keyword that determinesif other classes and methods in this program can access these classes and methods. we have various access modifiers like public, private, etc. Most of the time we use the public access modifier: 


### Basic structure of a Java Program

``` 
public class Main {
   public void main() {

    }
}
```

### Syntax 

1. Classes - PascalNamingConvention - 1st letter of every word uppercase
2. Methods camelNamingConvention - 1st lett of every word should be uppercase except the first word

##Under the hood 

1. javac Main.java
2. ls