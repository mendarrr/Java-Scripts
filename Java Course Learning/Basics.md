# Learning [JAVA]

## Core Concept: [Java Basics and Environment Setup]
> Summary

### Syntax & Code
```[language-id]
// Example code snippet
public class MyFirstJavaProgram {
    
    // Master the syntax for line 4
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Basic Syntax 
**Case Sensitivity** − Java is case sensitive, which means identifier Hello and hello would have different meaning in Java.

**Class Names** − For all class names the first letter should be in Upper Case. If several words are used to form a name of the class, each inner word's first letter should be in Upper Case.

> Example − class MyFirstJavaClass

**Method Names** − All method names should start with a Lower Case letter. If several words are used to form the name of the method, then each inner word's first letter should be in Upper Case.

> Example − public void myMethodName()

**Program File Name** − Name of the program file should exactly match the class name.

> When saving the file, you should save it using the class name (Remember Java is case sensitive) and append '.java' to the end of the name (if the file name and the class name do not match, your program will not compile).

> But please make a note that in case you do not have a public class present in the file then file name can be different than class name. It is also not mandatory to have a public class in the file.

> Example − Assume 'MyFirstJavaProgram' is the class name. Then the file should be saved as 'MyFirstJavaProgram.java'

**public static void main(String args[])** − Java program processing starts from the main() method which is a mandatory part of every Java program.

### Key Vocabulary
- **Term**: Definition or behavior.
- **Term**: Definition or behavior.

## Java Identifiers and Rules
- [ ] Rule 1: All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).
- [ ] Rule 2: After the first character, identifiers can have any combination of characters.
- [ ] Rule 3: A keyword cannot be used as an identifier.
- [ ] Rule 4: Most importantly, identifiers are case sensitive.

> Example of a Valid Identifier: age, $salary, _value, __1_value.
> Example of an Invalid Identifier: 123abc, -salary.

## Java Modifiers
**Access Modifiers** − default, public , protected, private
**Non-access Modifiers** − final, abstract, strictfp

## Java Variables Types
- Local Variables
- Class Variables (Static Variables)
- Instance Variables (Non-static Variables)

## Java Arrays
- Arrays are **objects that store multiple variables of the same type**. 
- However, an array itself is an object on the heap. 

## Java Enums
- Enums **restrict a variable to have one of only a few predefined values**. 
- The values in this enumerated list are called enums.
- With the use of enums it is possible to reduce the number of bugs in your code.

##Java Keywords



### Pro-Tips
> [!TIP]
> Use VS Code extensions like **Markdown All in One** or **Markdown Preview Enhanced** to make these notes look even better while you type.

---

## 🔗 Resources
- [Documentation Name](URL)
- [Tutorial Video](URL)
