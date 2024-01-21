# Practical1: Working with legacy code

This repository contains the stub code for Practical 1.

The source code adapted from: Deitel, Deitel. [Java How to Program, 11/e, Early Objects Version](https://github.com/pdeitel/JavaHowToProgram11e_EarlyObjects)

A description of the code, with a review of the main concepts for OOP is in Chpater 10 of the book: "Object-oriented programming: polymorphism and interfaces". A digitised compy of the chapter is avavilable on line in the reading list of the module.

We assume here that we have some existing code implementing a hierarchy of classes for managing employees, with different types of contracts.
Those existing classes are in the `legacy` package, and the following UML diagram shows their hierarchy:
![UML diagram](./hierarchy-legacy.png)

You can compile the code and make it available as a library to other projects by running the following command from the command line:
```mvn install```

Alternatively, in Visual Studio Code, you can use the Maven panel to run the `install` goal.