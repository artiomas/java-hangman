package lect16.spring.cars;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Audi implements Car {

    @Override
    public void uzvesti() {
        System.out.println("wroom wroom");

    }

}