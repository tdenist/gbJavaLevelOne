public class Plate {

    private Eat eat;

    public Plate(Eat eat) {
        this.eat = eat;
    }

    public Eat getEat() {
        return eat;
    }

    public void addEat(Eat eat) {
        this.eat = eat;
    }

    public boolean isPlateEmpty() {
        return this.eat.getCount() < 1;
    }
}