package pl.lucky.trainingmvcspringboot.component;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter
@Setter
public class TimeComponent {

    private long time;

    public TimeComponent() {
        time = System.currentTimeMillis();
    }

    @PostConstruct
    public void afterCreated() {
        System.out.println(this + " created");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println(this + " destroyed.");
    }
}
