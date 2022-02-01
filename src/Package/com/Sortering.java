package Package.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sortering {
    Scanner scanner = new Scanner(System.in);

    public void sorterOrd(){
        ArrayList<String> ordliste = new ArrayList<>();

        String ord1 = scanner.next();
        String ord2 = scanner.next();
        String ord3 = scanner.next();
        String ord4 = scanner.next();
        String ord5 = scanner.next();

        ordliste.add(ord1);
        ordliste.add(ord2);
        ordliste.add(ord3);
        ordliste.add(ord4);
        ordliste.add(ord5);

        Collections.sort(ordliste);

        System.out.println(ordliste);
    }

    public static void main(String[] args) {
        Sortering sort = new Sortering();

        sort.sorterOrd();
    }

}
