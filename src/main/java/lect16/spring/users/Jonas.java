package lect16.spring.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lect16.spring.cars.AutomobilisGatvejeFactory;

/**
 * Visu beans'u numatytas visibility scope'as: SINGLETON -> viena objekto kopija
 * visame kontekste
 */

@Component
@Scope(scopeName = org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Jonas {

    @Autowired
    private AutomobilisGatvejeFactory factory;

    public void sesdtiIrUzvesti() {

        System.out.println("Jonas isedo: " + factory.createCar().getClass().getSimpleName());
        factory.createCar().uzvesti();
    }

}