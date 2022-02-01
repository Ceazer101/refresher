package Package.com;

import java.util.Scanner;

public class Plæne {

    public double slåGræs(int græsLængde, int maxLængde){
        double dagligVoks = 0.8;
        double antalDage = 0;
        for (int i = græsLængde; i < maxLængde; i++) {
            antalDage = (i * dagligVoks);
        }
        return antalDage;
    }



    public static void main(String[] args) {
        Plæne plæne = new Plæne();
        Scanner scanner = new Scanner(System.in);

        int længder = scanner.nextInt();
        int længder2 = scanner.nextInt();
        System.out.println(plæne.slåGræs(længder, længder2));
    }
}
