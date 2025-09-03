// Source code is decompiled from a .class file using FernFlower decompiler.
package student;

public class Student {
  private int RollNo;
   private String Name;
   private String Department;
   char Section;
   static String collegeName = "KIET";

   public Student(int RollNo, String Name, String Department, char Section) {
      this.RollNo = RollNo;
      this.Name = Name;
      this.Department = Department;
      this.Section = Section;
   }

   public Student() {
      this.RollNo = 1;
      this.Name = "Pranjal";
      this.Department = "CSEAI";
      this.Section = 'C';
   }

   public Student(Student obj) {
      this.RollNo = obj.RollNo;
      this.Name = obj.Name;
      this.Department = obj.Department;
      this.Section = obj.Section;
   }

   public void studying(int no_of_hours) {
      System.out.println("The student is studying for " + no_of_hours + " hours");
   }

   public void displayInfo() {
      System.out.println("The name of the student is " + this.Name + " The college name is " + collegeName);
      System.out.println("The department is " + this.Department + " and section is " + this.Section);
   }

   public void payFee() {
      System.out.println("The student " + this.Name + " has paid the tuition fee.");
   }

   public void playing() {
      System.out.println("Student is playing");
   }

   public static void main(String[] args) {
      Student student1 = new Student(1, "Addy", "CSEAI", 'C');
      Student student2 = new Student();
      Student student3 = new Student(student1);
      collegeName = "IIT GUWAHATI";
      student1.Department = "AI";
      student1.Name = "Rohan";
      student1.RollNo = 1;
      student1.Section = 'C';
      student1.displayInfo();
      student1.playing();
      student1.studying(6);
      student2.displayInfo();
      student2.studying(9);
      student3.displayInfo();
   }





// static keyword
// it can be use as variable ,class,function
// it can be call by classname in varibale as well as function
// but In class sttaic keyword can be only use in inner class


// final keyword
// it can be use as function,class and variable;
// in fucntion we r using final keyword we cannot override
// in variable if we use it becomes constant
// in class if we use it cannot be inherit

// constructor
// this keyword helps in making a diffwerence btw class varivale nd costructir varibale

// overloading- same function name h but parameters different h 
// overriding-same name k function kai baar declare krdiye

// ineheritance
// there are many subclasses of a parent class.
// if only one subclass its classes called single inheritance,if there are mnay called multilevel inheritance
// A is a super class if B and C both inherit the superclass called hierarchical inheritance
//  two or more PARENTS ARE THERE FOR A SUBCLASS CALLED MULTIPLE INHERITNACE ND ITS ALSO NOT allow in java

// inheritance uses extends keyword
// subclass k constructor m agr parent ki property leni h toh this . krne ki need nhi we can use super keyword--super(Rollno,Name)

// polymorphism ek function diff behaviour in diff class-
// diff types- static polymorphism nd dynamic polymorphism


public void search(int RollNo){
   System.out.println("find by roll number");
}
public void search(int RollNo ,String Name){
   System.out.println("find by roll number and name");
}
public void search(String Name ,String Department){
   System.out.println("find by name nd department");
}
public void search(String Department ,char Section){
   System.out.println("find by department nd section");
}


}

// encapsulation
// 
