package service;

import model.Cat;
import model.Plate;

public class CatService {

    private Cat cat;

    public CatService(Cat cat) {
        this.cat = cat;
    }

    public void eat(Plate plate) {
        if(cat.isSatiety()){
            return;
        }
        else if(plate.getEat() < cat.getAppetite()) {
            System.out.println("Коту " + cat.getName() + "у" + " не хватило еды");
        }
        else {
            plate.decreaseEat(cat.getAppetite());
            cat.setSatiety(true);
        }
    }
}