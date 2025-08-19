public class Student{
    int Rollnumber;
    String Name;
    String Department;
    char section;
static String collegename="KIET";
// constructor
public Student(int Rollnumber,String Name,String Department,char section){
    this.Rollnumber=Rollnumber;
    this.Name=Name;
    this.Department=Department;
    this.section=section;
}

public void studying(int no_of_hours){

}
public void playing(){
    System.out.println("Student is playing");
}
public void Display(){
System.out.println("The name of the student is"+ Name + "THE COLLEGE IS " + collegename);
}
public static void main(String args[]){
    Student student1=new Student(1,"Rohan","AI",'C');
//  Student student3=new Student(student1); copy constructor
student1.Display();
Student.collegename="IIT";

student1.Display();
student1.playing();
student1.studying(5);
}
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

