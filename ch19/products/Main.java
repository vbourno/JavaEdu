package gr.aueb.cf.ch19.products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(new Product("Oranges", 2.5, 100),
                                                        new Product("Eggs", 8, 6),
                                                        new Product("Apples", 4.7, 5),
                                                        new Product("Milk", 1.8, 1),
                                                        new Product("Honey", 12.2, 1)));

        //(without Comparable implementation of class Product)
        products.sort(Comparator.comparing(Product::getDescription)
                .thenComparing(Product::getPrice)
                .thenComparing(Product::getQuantity));
        products.forEach(System.out::println);


//        Collections.sort(products, Comparator.naturalOrder());
//        products.forEach(System.out::println);
//        Collections.sort(products, Comparator.reverseOrder());
//        products.forEach(System.out::println);

        //Collections.sort(products);
        //products.forEach(System.out::println);
    }
}
