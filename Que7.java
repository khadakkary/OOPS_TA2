class Box<T> {
    T value;

    Box(T v) {
        value = v;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

public class Que7 {
    public static <T> void showItem(T item) {
        System.out.println("Item: " + item);
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(10);
        intBox.display();

        Box<String> strBox = new Box<>("Hello");
        strBox.display();

        showItem(5.5);
        showItem("Generic Method Example");
    }
}
