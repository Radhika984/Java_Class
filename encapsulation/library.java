package encapsulation;

public class library {
    private int borrowed_books;

    // final private int Max_BORROW=5;

   public void borrowBook(){
if(borrowed_books<5){
    borrowed_books++;
    System.out.println("The book has borrowed");
}else{
    System.out.println("can not borrow the book more than 5");
}
   }

   public void returnBook(){
    if(borrowed_books>0){
        borrowed_books--;
        System.out.println("The book has been returned");
    }else{
        System.out.println("No book available to return");
    }
   }
   
   public int getBorrowed_books() {
    return borrowed_books;
}

   

   
}
