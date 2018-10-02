package nl.rondgrt.test.activemqtest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    @Override
    public void run(String...args) throws Exception {
        System.out.println("Application started");
    }
}
