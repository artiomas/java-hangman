package lect16.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);
        ctx.refresh();

//		Gatve g = ctx.getBean(Gatve.class);

//		g.isausuRytui(false);

        ctx.close();

    }

}