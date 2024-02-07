package javabasicanna.homeworks.lecture2;

public class Parallelepiped {

    public static void main(String[] args) {
        int height = 5;
        int width = 3;
        int depth = 7;

        int volume = height * width * depth;
        System.out.println("Об'єм паралелепіпеда = " + volume);

        int length = 4 * (height + width + depth);
        System.out.println("Сумарну довжину всіх сторін = " + length);
    }
}