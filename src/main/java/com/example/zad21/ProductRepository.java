package com.example.zad21;

import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class ProductRepository {
    List<Product> lista = new LinkedList<>();

    public ProductRepository() {
        lista.add(new Product("Telefon", 12, Category.DOMOWE));
        lista.add(new Product("TV", 14, Category.DOMOWE));
        lista.add(new Product("Marchew", 2, Category.SPOZYWCZE));
        lista.add(new Product("Samochod", 142222, Category.INNE));
    }
}
