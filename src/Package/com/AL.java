package Package.com;

import java.util.ArrayList;

public class AL {

    public boolean doesArraylistContainString(ArrayList list, String string){
        if(!list.contains(string)){
            list.add(string);
            return false;
        } else {
            System.out.println("The string has been found");
            return true;
        }
    }

    public static void main(String[] args) {
        AL al = new AL();
        ArrayList list = new ArrayList();
        System.out.println(al.doesArraylistContainString(list, "haj"));
        System.out.println(list);
        System.out.println(al.doesArraylistContainString(list, "haj"));


    }
}
