package exercises.Mahat;

public class MyArt {
    private String artType;

    private double price;

    public MyArt(String artType, double price) {
        this.artType = artType;
        this.price = price;
    }

    public String getArtType() {
        return artType;
    }

    public double getPrice() {
        return price;
    }
}
