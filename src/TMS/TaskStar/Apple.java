package TMS.TaskStar;
//решение задачи со звездочкой с помощью вложенного класса
public class Apple {
    private String color;

    public Apple(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Apple myApple = new Apple("красный");

        myApple.color = "зеленый";

        System.out.println("Цвет яблока: " + myApple.getColor());
    }
}