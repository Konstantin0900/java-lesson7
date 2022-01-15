package com.geekbrains;

class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void addFood(int food){
        this.food += food;
        System.out.println("Добавлено еды " + food);
    }
    public boolean decreaseFood(int appetite) {
        if (appetite <= food){
            food-=appetite;
                    return true;
        } else return false;
    }
    public void info() {
        System.out.println("в тарелке: " + food + " еды");
    }
}
class Cat {
    private String name;
    private String color;
    private int appetite;
    private boolean hungry;

    public Cat(String name, String color, int appetite) {
        this.name = name;
        this.color = color;
        this.appetite = appetite;
        this.hungry = true;
    }


    public void eat(Plate p) {
        System.out.println(name + " съел " + appetite + " еды");
        if (p.decreaseFood(appetite))
            hungry = false;
     else  System.out.println("Не достаточно еды в тарелке");
    }

    public void info(){
        System.out.println(name + "Голоден: " + hungry);
    }
}


