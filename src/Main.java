public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[6];
        cats[0] = new Cat("Снежок", 4);
        cats[1] = new Cat("Чижик", 2);
        cats[2] = new Cat("Барсик", 7);
        cats[3] = new Cat("Мурка", 1);
        cats[4] = new Cat("Веста", 3);
        cats[5] = new Cat("Гарфилд", 5);
        Plate plate = new Plate(20);
        plate.showInfo();
        for (Cat cat: cats){
            cat.eatFrom(plate);
        }
        plate.showInfo();
        plate.addFood(100);
        plate.showInfo();
    }
}