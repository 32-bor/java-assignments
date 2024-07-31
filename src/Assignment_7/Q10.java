package Assignment_7;

public class Q10 {
    public static void main(String[] args) {
        Book b = new Book(1,"Intro to Algorithms",200,"CLRS");
        System.out.println(b);

    }
}

class Book{
    private int bookId;
    private String title;
    private double price;
    private String author;

    Book(int bookId,String title,double price,String author){
        this.bookId=bookId;
        this.title=title;
        this.price=price;
        this.author=author;
    }
    public void setBookId(int bookId){
        this.bookId=bookId;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public int getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public String getAuthor(){
        return author;
    }
    @Override
    public String toString(){
        return "{BookId:"+bookId+", Title:"+title+", Price:"+price+", Author"+author+'}';
    }
}
