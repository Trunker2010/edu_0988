public class Main {
    public static void main(String[] args) {
        Person gff = new Person("Иоган", "Лавреньев", 100, null, null);//отец отца
        Person gmf = new Person("Виктория", "Лавреньева", 100, null, null);//мать отца
        Person gfm = new Person("Варфоломей", "Игнатов", 100, null, null);//отец матери
        Person gmm = new Person("Елена", "Крюкова", 100, null, null);//мать матери
        Person mather = new Person("Надежда", "Игнатова", 50, gmm, gfm); //мать
        Person father = new Person("Александр", "Игнатов", 50, gmf, gff); //отец
        Person child = new Person("Иван", "Петров", 20, mather, father);
        child.info();
    }
}

class Person { // Описание того, как должен выглядить человек
    String name;
    String lastname;
    int age;
    Person mother;
    Person father;

    Person(String name, String lastname, int age, Person mother, Person father) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    void info() {
        String info = "Привет меня зовут " + this.name + " " + this.lastname + "\n" +
                "Мне " + this.age + " лет \n";

        if (this.mother != null) { // Проверка существования матери
            info += "Мою маму зовут " + this.mother.name + "\n";
            if (this.mother.father != null) { // Проверка существования отца матери (дедушки по маминой линии)
                info += "Дедушку по маминой линии зовут " + this.mother.father.name + "\n";
            }
            if (this.mother.mother != null) {
                info += "Бабушку по маминой линии зовут " + this.mother.mother.name + "\n";
            }
        }
        if (this.father != null) { //Проверка существования отца
            info += "Моего папу зовут " + this.father.name+"\n";
            if (this.father.father != null) {
                info += "Дедушку по папиной линии зовут " + this.father.father.name + "\n";
            }
            if (this.father.mother != null) {
                info += "Бабушку по папиной линии зовут " + this.father.mother.name + "\n";
            }
        }
        System.out.println(info);
    }

    void sayHi(String name) {
        System.out.println("Привет " + name);
    }
}
