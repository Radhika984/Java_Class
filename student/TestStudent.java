// Source code is decompiled from a .class file using FernFlower decompiler.
package student;

public class TestStudent {
   public TestStudent() {
   }

   public static void main(String[] args) {
      Student student1 = new Student(1, "Addy", "CSEAI", 'C');
      new Student();
      new Student(student1);
      new RegularStudent(1, "Priya", "Aiml", 'G', 80, "H506");
      new OnlineStudent(2, "Pranjal", "Ai", 'H', "Java", "12000");
      HostelStudent hs = new HostelStudent(3, "ABC", "IT", 'B', 68, "E805", "Gargi");
      hs.payFee();
      System.out.println(hs.hostel_name);

Student st=new Student();
st.search(1);
st.search(1,"Radhika");
st.search("Radhika","AIML");
st.search("AIML",'C');
      

   }

  

}
