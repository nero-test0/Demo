import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i < 100; i++) {
           list.add(i); 
        }
        list.stream()
            .filter(p -> p % 2 == 0)
            .filter(p -> p % 3 == 0)
            .forEach(System.out::println);
    }
}
