package lect16.spring.cars;

import javax.annotation.PostConstruct;

import lect16.spring.users.Jonas;
import lect16.spring.users.Petras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gatve {


    @Autowired
    private Petras petras;

    @Autowired
    private Jonas jonas;

    @Autowired
    private AutomobilisGatvejeFactory factory;


    @PostConstruct
    public void isausuRytui() {
        isausuRytui(true);
    }


    public void isausuRytui(boolean b) {

        factory.initFactory(b);


        jonas.sesdtiIrUzvesti();

        petras.sesdtiIrUzvesti();


    }

}