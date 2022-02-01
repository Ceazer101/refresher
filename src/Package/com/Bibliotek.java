package Package.com;

import java.util.ArrayList;

public class Bibliotek {

    private ArrayList<Bog> bøger = new ArrayList<>();


    public boolean bookInventory(Bog bog){
        for (Bog b : bøger){
            if (bog.getISBN() == b.getISBN()){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Bibliotek bibliotek = new Bibliotek();

        Bog bog1 = new Bog(459, "lille bubu", 1879);
        bibliotek.bøger.add(bog1);
        Bog bog2 = new Bog(897, "susans eventyr", 1980);
        //bibliotek.bøger.add(bog2);
        Bog bog3 = new Bog(763, "kiki er dum", 2021);
        bibliotek.bøger.add(bog3);



        System.out.println(bibliotek.bookInventory(bog1));
        System.out.println(bibliotek.bookInventory(bog2));


    }


}
