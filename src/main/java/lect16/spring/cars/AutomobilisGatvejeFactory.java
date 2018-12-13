package lect16.spring.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class AutomobilisGatvejeFactory {

    @Autowired
    private Audi audi;

    @Autowired
    private Tesla tesla;

    private boolean carTeslaAudi;

    public void initFactory(boolean b) {
        carTeslaAudi = b;
    }

    public Car createCar() {

        if (carTeslaAudi) {
            return tesla;
        } else {
            return audi;
        }

    }

}