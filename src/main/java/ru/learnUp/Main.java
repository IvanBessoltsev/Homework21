package ru.learnUp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.learnUp.Annotation.LogMethod;
import ru.learnUp.Annotation.WorkTime;

public class Main {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Player player = context.getBean("playerBean", Player.class);
        Game game = context.getBean("gameBean", Game.class);

        game.play();
        game.welcomePlayer(player);
        context.close();


    }
}


//LogMethod - все методы помеченные данной аннотацией должны логгировать имя
// метода параметры метода и возвращаемое значение
//        WorkTime - все методы помеченные данной аннотацией должны выводить
//        название метода и время работы метода
