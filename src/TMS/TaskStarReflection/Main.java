package TMS.TaskStarReflection;

import java.lang.reflect.Field;
/*
понимаю что не проходили такого,но стало интересно
* на Дзене нашел пару способов получить доступ к приватным полям извне
одним из них был рефлексия(понравилось слово=) )
*в javarush нашел статью про рефлексию
*в итоге что-то получилось
* */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple1 = new Apple("красный");

        Field colorField = Apple.class.getDeclaredField("color");
        colorField.setAccessible(true);

        colorField.set(apple1, "зеленый");

        System.out.println("новый цвет яблока-"+apple1.getColor());


    }
}