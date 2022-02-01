package Package.com;

public class Bog {

    private int ISBN;
    private String titel;
    private int udgivelsesÅr;

    public Bog(int ISBN, String titel, int udgivelsesÅr) {
        this.ISBN = ISBN;
        this.titel = titel;
        this.udgivelsesÅr = udgivelsesÅr;
    }


    public int getISBN() {
        return ISBN;
    }


    @Override
    public String toString() {
        return "Package.com.Bog{" +
                "ISBN=" + ISBN +
                ", titel='" + titel + '\'' +
                ", udgivelsesÅr='" + udgivelsesÅr + '\'' +
                '}';
    }
}
