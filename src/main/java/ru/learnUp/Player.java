package ru.learnUp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Player {
    @Value("Igor")
    private String name;
    @Value("30")
    private int age;

    public String getName() {
        return name;
    }


}
