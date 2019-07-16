package com.example.zad21;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;
import java.util.List;

@Controller
public class MainController {
    List<Product> lista = new LinkedList<>();


    @ResponseBody
    @RequestMapping("/lista")
    public String lista(@RequestParam String category) {
        String result = "";
        double sum = 0;
        if (lista.isEmpty()) {
            lista.add(new Product("Telefon", 12, Category.DOMOWE));
            lista.add(new Product("TV", 14, Category.DOMOWE));
            lista.add(new Product("Marchew", 2, Category.SPOZYWCZE));
            lista.add(new Product("Samochod", 142222, Category.INNE));
        }
        if (category.equals("inne")) {
            for (Product product : lista) {
                if (product.getCategory().equals(Category.INNE)) {
                    sum += product.getPrice();
                    result += product.getName() + " " + product.getPrice() + " " + product.getCategory() + "<br/>";
                }

            }
        } else if (category.equals("spozywcze")) {
            for (Product product : lista) {
                if (product.getCategory().equals(Category.SPOZYWCZE)) {
                    sum += product.getPrice();
                    result += product.getName() + " " + product.getPrice() + " " + product.getCategory() + "<br/>";
                }
            }
        } else if (category.equals("domowe")) {
            for (Product product : lista) {
                if (product.getCategory().equals(Category.DOMOWE)) {
                    sum += product.getPrice();
                    result += product.getName() + " " + product.getPrice() + " " + product.getCategory() + "<br/>";
                }
            }
        } else if (category.equals("wszystko")) {
            for (Product product : lista) {
                sum += product.getPrice();
                result += product.getName() + " " + product.getPrice() + " " + product.getCategory() + "<br/>";
            }
        }
        result += sum;

        return result;
    }
}
