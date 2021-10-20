package model;

public class Plate {

    private int eat;

    public Plate(int eat) {
        this.eat = eat;
    }

    public int getEat() {
        return eat;
    }

    public void addEat(int eat) {
        this.eat += eat;
    }

    public boolean isPlateEmpty() {
        return this.eat < 1;
    }

    public void decreaseEat(int count) {

        if (this.eat < count) {
            /*
             Оставил как проверку на ввод,
             чтобы количество еды в тарелке не было отрицательным.
             Но из-за проверки if(plate.getEat() < cat.getAppetite()) в методе CatService.eat
             в эту часть кода не попадем в данном задании.
             */
            System.out.println("Еда закончилась");
            return;
        }
        this.eat -= count;
    }
}