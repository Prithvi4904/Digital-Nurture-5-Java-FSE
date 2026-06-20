package com.cognizant.ecommercesearch;

public class BinarySearch {

    public static Product search(Product[] products, int productId) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (products[mid].getProductId() == productId) {
                return products[mid];
            }

            if (products[mid].getProductId() < productId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }
}