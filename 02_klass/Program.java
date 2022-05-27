import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Apple apple = new Apple("Apple Brazilia", "Very very delicious apple!", 1.2, 5);
        Orange orange = new Orange("Orange Brazilia", "Very tasy orange", 1.5, 10);
        Banana banana = new Banana("Banana", "Very very delicious and tasty banana", 1.3, 7);

        Cart cart = new Cart(Arrays.asList(apple, orange, banana));
        cart.pay();
    }
}