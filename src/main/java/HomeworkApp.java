import model.Cat;
import model.Plate;
import service.CatService;

public class HomeworkApp {

    public static void main(String[] args) {

        Plate plate = new Plate(20);
        Cat[] cat = new Cat[3];

        cat[0] = new Cat("Мурзик", 5);
        cat[1] = new Cat("Пушок", 10);
        cat[2] = new Cat("Матроскин", 15);

        CatService[] catService = new CatService[3];

        for (int i = 0; i < cat.length; i++){
            catService[i] = new CatService(cat[i]);
        }

        for (int i = 0; i < catService.length; i++) {
            catService[i].eat(plate);
            if (cat[i].isSatiety())
                System.out.println("Кот " + cat[i].getName() + " сыт");
            else
                System.out.println("Кот " + cat[i].getName() + " еще голоден");
        }
        System.out.println("Колическтво еды в тарелке: " +plate.getEat());

        System.out.println();
        plate.addEat(10);
        System.out.println("Колическтво еды в тарелке: " +plate.getEat());
        System.out.println();

        for (int i = 0; i < catService.length; i++) {
            catService[i].eat(plate);
            if (cat[i].isSatiety())
                System.out.println("Кот " + cat[i].getName() + " сыт");
            else
                System.out.println("Кот " + cat[i].getName() + " еще голоден");
        }
        System.out.println("Колическтво еды в тарелке: " +plate.getEat());
    }
}