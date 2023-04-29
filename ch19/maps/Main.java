package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Map<String, Product> products = new HashMap<>() {
            {
                put("ORA", new Product("ORA", "Oranges", 10.5, 20));
                put("HON", new Product("HON", "Honey", 12.5, 10));
                put("MIL", new Product("MIL", "Milk", 1.2, 1));
                put("EGG", new Product("EGG", "Eggs", 5.2, 6));
            }
        };

        Map<String, Object> criteria = new HashMap<>() {{
            put("Description", "Eggs");
        }};

        String eggs = products.values().stream()
                        .filter(pro -> pro.getDescription().equals(criteria.get("Description")))
                        .map(Product::toString)
                        .collect(Collectors.joining());

        System.out.println(eggs);
        System.out.println();

        products.entrySet().forEach(System.out::println);
        System.out.println();
        products.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println();

        String orangesStr = products.entrySet().stream()
                .filter(entry -> entry.getKey().equals("ORA"))
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        System.out.println(orangesStr);
        System.out.println();

        String productsByPrice = products.entrySet().stream()
                .filter(entry -> entry.getValue().getPrice() > 5.1)
                .map(Object::toString)
                .collect(Collectors.joining("\n"));

        System.out.println(productsByPrice);
        System.out.println();

        List<Product> pros = products.values().stream()
                .filter(product -> product.getPrice() > 10.2)
                .collect(Collectors.toList());

        pros.forEach(System.out::println);
        System.out.println();

        int total = products.values().stream()
                .filter(product -> product.getPrice() > 5)
                .mapToInt(Product::getQuantity)
                .sum();

        System.out.println(total);
        System.out.println();

        int total2 = products.values().stream()
                .filter(product -> product.getPrice() > 10.2)
                .mapToInt(Product::getQuantity)
                .reduce(0, Integer::sum);

        System.out.println(total2);
    }
}
