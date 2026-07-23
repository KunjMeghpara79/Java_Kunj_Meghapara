import java.util.ArrayList;
import java.util.List;

interface lib_items{
    void ShowDetail();
}

class Library{
    private String name;
    private List<lib_items> list;
    Library(String name,List<lib_items> list){
        this.name = name;
        this.list = list;
    }
}
class Book implements lib_items{
    private String title;
    private String author;
    private String sr_no;
    private boolean available;

    Book(String title,String author,String sr_no,boolean available){
        if(sr_no.length() != 6){
            System.out.println("Invalid Serial number !");
        }else {
            this.title = title;
            this.author = author;
            this.sr_no = sr_no;
            this.available = available;
        }
    }
    @Override
    public void ShowDetail() {
        System.out.println("Book Details are as follow : ");
        System.out.println("Book Name      :  "+this.title);
        System.out.println("Author name    :  "+this.author);
        System.out.println("Serial number  :  "+this.sr_no);
        System.out.println("Status         :  "+((this.available) ? "Available" : "Not available"));
    }
}
class Novel implements lib_items{
    private String title;
    private String author;
    private String sr_no;
    private boolean available;

    Novel(String title,String author,String sr_no,boolean available){
        if(sr_no.length() != 6){
            System.out.println("Invalid Serial number !");
        }else {
            this.title = title;
            this.author = author;
            this.sr_no = sr_no;
            this.available = available;
        }
    }
    @Override
    public void ShowDetail() {
        System.out.println("Novel Details are as follow : ");
        System.out.println("Novel Name      :  "+this.title);
        System.out.println("Author name     :  "+this.author);
        System.out.println("Serial number   :  "+this.sr_no);
        System.out.println("Status          :  "+((this.available) ? "Available" : "Not available"));
    }
}

public class Day_1_2 {
    public static void main(String[] args) {
        List<lib_items> list = new ArrayList<>();
        Library lib = new Library("Public library",list);
    }
}
