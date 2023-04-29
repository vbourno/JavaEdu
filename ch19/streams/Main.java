package gr.aueb.cf.ch19.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Oranges", 2.5, 100),
                new Product("Eggs", 8, 6),
                new Product("Apples", 4.7, 5),
                new Product("Milk", 1.8, 1),
                new Product("Honey", 12.2, 1),
                new Product("Oranges", 12.2, 1),
                new Product("Oranges", 12.2, 5)
        ));

        List<Product> oranges = products.stream()
                .filter(product -> product.getDescription().equals("Oranges"))
                .collect(Collectors.toList());

        products.stream()
                .filter(product -> product.getDescription().equals("Oranges"))
                .forEach(System.out::println);

        List<Product> notOranges = products.stream()
                .filter(product -> !product.getDescription().equals("Oranges"))
                .sorted(Comparator.comparing(Product::getDescription))
                .collect(Collectors.toList());

        List<Double> prices = products.stream()
                .map(Product::getPrice)
                .collect(Collectors.toList());

        List<Product> updatedPrices = products.stream()
                .map(p -> new Product(p.getDescription(), p.getPrice() + p.getPrice() * 0.2, p.getQuantity()))
                .collect(Collectors.toList());

        int orangesTotalCount = products.stream()
                .filter(p -> p.getDescription().equals("Oranges"))
                .reduce(0, (total, e) -> total + e.getQuantity(), Integer::sum);

        double orangesSum = products.stream()
                .filter(p -> p.getDescription().equals("Oranges"))
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
