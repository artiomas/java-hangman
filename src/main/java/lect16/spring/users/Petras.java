package lect16.spring.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lect16.spring.cars.Car;
import lect16.spring.cars.Tesla;

@Component
public class Petras {

    @Autowired
    @Qualifier(Tesla.TESLA_NAME)
    private Car tesla;

    public void sesdtiIrUzvesti() {

        System.out.println("Petras isedo: " + tesla.getClass().getSimpleName());
        tesla.uzvesti();
    }

}