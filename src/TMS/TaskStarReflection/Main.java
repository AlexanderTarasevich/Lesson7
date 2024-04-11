package TMS.TaskStar;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple1 = new Apple("красный");

        Field colorField = Apple.class.getDeclaredField("color");
        colorField.setAccessible(true);

        colorField.set(apple1, "зеленый");

        System.out.println("новый цвет яблока-"+apple1.getColor());


    }
}