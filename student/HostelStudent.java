package student;

public class HostelStudent extends RegularStudent{
    String hostel_name;
// constructor
    public HostelStudent(int Rollnumber,String Name,String Department,char section,int attend_per,String class_room,String hostel_name){
super(Rollnumber, Name, Department, section,attend_per,class_room);
this.hostel_name=hostel_name;
    }

    public void payFee() {
      System.out.println("The student of hostel " + this.hostel_name + " has submitter the fees.");
   }

}
