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

## Under the hood 

1. javac Main.java
2. ls


## Notes from code academy

#### Java programs have a specific structure in how the code is written. There are key elements that all Java programs share.

#### The Program
We have the text of a program inside the file called HelloWorld.java.

```
// This program outputs the message "Hello World!" to the monitor

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}

```

This program writes Hello World! to your terminal when run.

## Case-Sensitivity
Java is a case-sensitive language. Case sensitivity means that syntax, the words our computer understands, must match the case. For example, the Java command for outputting text to the screen is System.out.println(). If you were to type system.out.println() or System.Out.println(), the compiler would not know that your intention was to use System or out.

Let’s go over this HelloWorld.java program line by line:

## Comments

```
// This program outputs the message "Hello World!" to the monitor
This is a single-line comment that documents the code. The compiler will ignore everything after // to the end of the line. Comments provide information outside the syntax of the language.

```


### Classes

```
public class HelloWorld { 
  // class code
}

```

This is the class of the file. All Java programs are made of at least one class. The class name must match the file: our file is HelloWorld.java and our class is HelloWorld. We capitalize every word, a style known as pascal case. Java variables and methods are named in a similar style called camel case where every word after the first is capitalized.

The curly braces, { and }, mark the scope of the class. Everything inside the curly braces is part of the class.

### Methods

```
  public static void main(String[] args) {
   // Statements
  }
```

Every Java program must have a method called main(). A method is a sequence of tasks for the computer to execute. This main() method holds all of the instructions for our program.

### Statements

```
System.out.println("Hello World!");
```

This code uses the method println() to send the text “Hello World!” to the terminal as output. println() comes from an object called out, which is responsible for various types of output. Objects are packages of state and behavior, and they’re often modeled on real-world things.

out is located within System, which is another object responsible for representing our computer within the program! We can access parts of an object with a ., which is known as dot notation.

This line of code is a statement, because it performs a single task. Statements always conclude with a semicolon.

### Whitespace
Java programs allow judicious use of whitespace (tabs, spaces, newlines) to create code that is easier to read. The compiler ignores whitespace, but humans need it! Use whitespace to indent and separate lines of code. Whitespace increases the readability of your code.