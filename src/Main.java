import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        final int REAL_PRICE_FOR_METRE = 1100;
        Scanner scanner = new Scanner(System.in);
        Set<Area> set = createAreas();
        Consumer<Area> consumer = x -> System.out.println(x + " - СДЕЛКА ЧЕСТНАЯ");

        System.out.println("Введите цену за квадратный метр");
        int personPrice = scanner.nextInt();
        Predicate<Integer> isHonest = x -> x > (REAL_PRICE_FOR_METRE) && x < personPrice;

        for (Area area : set) {
            if (isHonest.test(area.priceForMetre())) {
                consumer.accept(area);
            }
        }
    }

    public static Set<Area> createAreas() {
        Set<Area> set = new HashSet<>();
        Consumer<Area> consumer = set::add;
        for (int i = 1; i < 11; i++) {
            Area area = new Area(i * 14, i * 11, i * 700_000);
            consumer.accept(area);
        }
        return set;
    }
}
