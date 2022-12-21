import java.util.ArrayList;
import java.util.Collections;

//Create an ArrayList object called cars that will store strings
public class ArrayList_Sample {
    public static ArrayList<String> cars = new ArrayList<String>();

    public static void main(String[] args) {
        addItems();     //add items in to the arraylist
        getArrayListSize();     //get the size or the number of elements on the arraylist
        accessItems(1);     //specify the index of the element
        changeItem(0, "Mazda");     //change the specified index of the element
        removeItem(2);      //remove the specified element
        clearAllItem();     //clear all items in the arraylist
        sortCollections();  //sorting the element alphabetical or numerical
    }

    public static void addItems() {
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        for(String car : cars){
            System.out.println(car);
        }
    }

    public static void accessItems(int n) {
        System.out.println(cars.get(n));
    }

    public static void changeItem(int n, String m) {
        cars.set(n, m);
        System.out.println(cars);
    }

    public static void removeItem(int n) {
        cars.remove(n);
        System.out.println(cars);
    }

    public static void clearAllItem() {
        cars.clear();
    }

    public static void getArrayListSize() {
        System.out.println(cars.size());
    }

    public static void sortCollections(){
        Collections.sort(cars);
        System.out.println("========");
        for(String car : cars){
            System.out.println(car);
        }
    }
}
