package com.cognizant.ecommercesearch;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Book", "Education")

        };

        int searchId = 104;

        System.out.println(" Linear Search ");

        long startLinear = System.nanoTime();

        Product linearResult =
                LinearSearch.search(products, searchId);

        long endLinear = System.nanoTime();

        System.out.println(linearResult);

        System.out.println(
                "Execution Time: "
                        + (endLinear - startLinear)
                        + " ns");

        System.out.println();

        System.out.println("= Binary Search =");

        long startBinary = System.nanoTime();

        Product binaryResult =
                BinarySearch.search(products, searchId);

        long endBinary = System.nanoTime();

        System.out.println(binaryResult);

        System.out.println(
                "Execution Time: "
                        + (endBinary - startBinary)
                        + " ns");
    }
}