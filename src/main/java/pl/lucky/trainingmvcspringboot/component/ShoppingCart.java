package pl.lucky.trainingmvcspringboot.component;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.LinkedList;
import java.util.List;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter
@Setter
public class ShoppingCart {
    private List<String> products;

    public ShoppingCart() {
        products = new LinkedList<>();
    }

    public void addProduct(String product){
        products.add(product);
    }

    @PostConstruct
    public void create() {
        System.out.println(this + " created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(this + " destroyed");
    }
}
