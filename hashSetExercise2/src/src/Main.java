import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //the object
        String myFavDessert = "Oreo CheeseCake";

        // if statement
        if (myList().contains(myFavDessert)){
            System.out.println(myFavDessert + " is in the dessert list");
        } else {
            System.out.println(myFavDessert + " is  not in the dessert list");
        }
    }

    // the hashset
    public static Set<String> myList(){
        Set<String> myDessertList = new HashSet<String>();
        myDessertList.add("Tiramisu");
        myDessertList.add("CheeseCake");
        return myDessertList;
    }
}