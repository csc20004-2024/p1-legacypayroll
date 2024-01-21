/* **********************
 * CSC-20004 2023/24     
 * Working with legacy code
 * Source code adapted from: 
 * Deitel, Deitel. Java How to Program, 11/e, Early Objects Version
 * https://github.com/pdeitel/JavaHowToProgram11e_EarlyObjects
 * **********************/

 // Fig. 10.4: Employee.java
// Employee abstract superclass.

package uk.ac.keele.csc20004.legacy;

/**
 * This is the class defining an Employee for the purposes of
 * Deitel's example: basically, stores the attributes 
 * (first and last name, plus Social Security Number, as the target is
 * a US employee). 
 * The class provides a specialised toString() method but does not
 * implement the earnings() method (hence, it's abstract)
 */
public abstract class Employee {
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;

   /**
    * Standard constructor; just sets the required attributes.
    * 
    * @param firstName first name of the employee 
    * @param lastName last name of the employee 
    * @param socialSecurityNumber the SSN (a sequence of digits in the form ddd-dddd-ddd)
    */
   public Employee(String firstName, String lastName, 
      String socialSecurityNumber) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
   } 

   // return first name
   public String getFirstName() {return firstName;}

   // return last name
   public String getLastName() {return lastName;}

   // return social security number
   public String getSocialSecurityNumber() {return socialSecurityNumber;}

   // return String representation of Employee object
   @Override
   public String toString() {
      return String.format("%s %s%nsocial security number: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber());
   }

   // abstract method must be overridden by concrete subclasses
   public abstract double earnings(); // no implementation here
} 



/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
