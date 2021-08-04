/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/

public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 10, 15);
        Dog spikeDog = new Dog("Spike", 12, 16);

        //напишите тут ваш код
    }
}

class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}

class Cat {
    String name;
    int height;
    int speed;

    public Cat(String name, int height, int speed) {
        this.name = name;
        this.height = height;
        this.speed = speed;
    }
}

class Dog {
    String name;
    int height;
    int speed;

    public Dog(String name, int height, int speed) {
        this.name = name;
        this.height = height;
        this.speed = speed;
    }
}
