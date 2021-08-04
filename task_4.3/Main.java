/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, по вашему усмотрению
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 10;
        cat1.weight = 15;
        cat1.strength=20;
        Cat cat2 = new Cat();
        cat2.age = 10;
        cat2.weight = 15;
        cat2.strength=25;
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}

class Cat {
    public int age;
    public int weight;
    public int strength;
    public int winCount;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        this.winCount = 0;
        anotherCat.winCount = 0;
        if (this.age > anotherCat.age) {
            this.winCount++;
        } else if (this.age == anotherCat.age) {
            this.winCount++;
            anotherCat.winCount++;
        } else {
            anotherCat.winCount++;
        }
        if (this.weight > anotherCat.weight) {
            this.winCount++;
        } else if (this.weight == anotherCat.weight) {
            this.winCount++;
            anotherCat.winCount++;
        } else {
            anotherCat.winCount++;
        }
        if (this.strength > anotherCat.strength) {
            this.winCount++;
        } else if (this.strength == anotherCat.strength) {
            this.winCount++;
            anotherCat.winCount++;
        } else {
            anotherCat.winCount++;
        }
        return this.winCount > anotherCat.winCount;
    }
}
