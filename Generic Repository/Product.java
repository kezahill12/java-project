public class Product {
    private String title;
    private double price;
    private int id;

    public Product(String title, double price, int id){
        this.title = title;
        this.price = price;
        this.id = id;
    }

    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public int getId(){
        return id;
    }
    @Override
    public String toString() {
        return "Product{title ='" + title + "', price =" + price + ", id =" + id + '}';
    }
    
}
