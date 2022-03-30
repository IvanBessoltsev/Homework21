package ru.learnUp;

//import ru.learnUp.Annotation.WorkTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.learnUp.Annotation.LogMethod;
import ru.learnUp.Annotation.WorkTime;

@Component
public class Game {
    @Value("Mortal Kombat")
    private String name;
    private Player player;

    public String getName() {
        return name;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @LogMethod
    public void play() {
        System.out.println("Игра начинается");
    }

    @WorkTime
    public String welcomePlayer(Player player) {
        System.out.println("Игрок " + player.getName() + " приветствуем Вас в игре " + this.getName());
        String str = " Игрок " + player.getName() + " приветствуем Вас в игре " + this.getName();
        return str;
    }


}



