import java.util.ArrayList;

public class Book {
    private String title;
    private boolean borrowed;


    public Book (String bookTitle){
        this.title = bookTitle;
    }



    public void borrowed (){
        this.borrowed =true;
    }

    public void returned(){
        this.borrowed = false;
        //returned = this.title;
    }

    public boolean isBorrowed() {
        if (borrowed){
            return true;
        }else return false;
    }

    public String getTitle(){
        return title;
    }

}
