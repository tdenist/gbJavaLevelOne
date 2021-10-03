public class HomeworkApp {

    public static void main(String[] args) {

        Dog dogBobik= new Dog("Бобик");
        Dog dogSharik = new Dog("Шарик");
        Cat catMurzik = new Cat("Мурзик");
        Cat catMatroskin = new Cat("Матроскин");

        dogBobik.run(400);
        dogBobik.swim(5);
        dogSharik.run(600);
        dogSharik.swim(60);

        catMatroskin.run(100);
        catMurzik.run(500);
        catMurzik.swim(10);

        catMatroskin.printCreatedAnimalsCount();
    }
}
