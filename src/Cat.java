public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eatFrom(Plate plate) {
        if (plate.foodCheck(appetite) && !satiety){
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " ест из тарелки");
        }
        else if (!plate.foodCheck(appetite)){
            System.out.println("Котик " + name + " не может поесть, потому что в тарелке не хватает еды");
        }
        else if (satiety) {
            System.out.println("Котик " + name + " сыт и не хочет есть");
        }

    }
}