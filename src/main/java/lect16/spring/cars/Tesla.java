package lect16.spring.cars;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(Tesla.TESLA_NAME)
@Scope(scopeName = org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Tesla implements Car {

    public static final String TESLA_NAME = "ev";

    @Override
    public void uzvesti() {

        System.out.println("pyp pyp");
    }

}