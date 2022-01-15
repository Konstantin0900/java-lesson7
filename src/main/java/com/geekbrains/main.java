package com.geekbrains;


class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "Рыжий", 80);
        Cat cat1 = new Cat("Мурзик", "Серый", 15);
        Cat cat2 = new Cat("Васька", "Белый", 25);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        cat1.eat(plate);
        cat2.eat(plate);
        plate.info();
    }
}
