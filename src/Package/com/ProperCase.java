package Package.com;

import java.util.Locale;

public class ProperCase {

    public void sætningsliste (String sætning){
        String[] ordliste = sætning.split(" ");

        for (String s: ordliste) {

            if(s.equals(s.toUpperCase())){
                System.out.println(s.toUpperCase());
            } else if(s.length() > 3){
                String stortB = s.substring(0,1).toUpperCase();
                String lilleB = s.substring(1).toLowerCase();

                System.out.println(stortB + lilleB);
            } else if (s.length() <= 3){
                System.out.println(s.toLowerCase());
            }

        }
    }

    public static void main(String[] args) {
        ProperCase pc = new ProperCase();
        pc.sætningsliste("Anja er eN liLle dum HUND, Der aldrig tager ET Bad");
    }
}
