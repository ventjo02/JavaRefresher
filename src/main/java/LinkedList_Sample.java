import java.util.LinkedList;

public class LinkedList_Sample {
    public static LinkedList<String> cars = new LinkedList<String>();

//    volvo/
//    bmw/
//    ford/
//============
//    bmw
//    chevrolet
//    volvo
//    audi

    public static void main(String[] args) {
        createItem();
        printItem();
        removeFirstIndexItem();
        changeItem(1, "chevrolet");
        insertLastIndexItem("volvo");
        insertLastIndexItem("audi");
        printItem();
    }

    public static void printItem() {
        System.out.println("============");
        for (String car : cars) {
            System.out.println(car);
        }
    }

    public static void createItem() {
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
    }

    public static void insertFirstIndexItem(String m) {
        cars.addFirst(m);
    }

    public static void insertLastIndexItem(String m) {
        cars.addLast(m);
    }

    public static void removeFirstIndexItem() {
        cars.removeFirst();
    }

    public static void removeLastIndexItem() {
        cars.removeLast();
    }

    public static void changeItem(int n, String m){
        cars.set(n,m);
    }
}
