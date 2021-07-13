public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (foodCheck(appetite)){
            food -= appetite;
        }
        else {
            System.out.println("В тарелке не хватает еды, чтобы котик наелся");
        }

    }
    public  boolean foodCheck(int appetite) {
        return appetite <= food;
    }

    public void showInfo() {
        System.out.println("В тарелке: " + food + " единицы еды");
    }
    public void addFood(int countFood){
        food += countFood;
    }
}
