package pl.lucky.trainingmvcspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.lucky.trainingmvcspringboot.component.ShoppingCart;

import java.util.List;

@Controller
public class PrintCartController {

    private ShoppingCart cart;

    @Autowired
    public PrintCartController(ShoppingCart cart) {
        this.cart = cart;
    }

    @GetMapping("/print")
    public String printCart(){
        cart.getProducts().forEach(System.out::println);
        return "index";
    }
}
