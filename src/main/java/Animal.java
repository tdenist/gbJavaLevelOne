public abstract class Animal {

    public String name;
    static int animalCount;

    public Animal(){
        animalCount++;
    }

    public void printAnimalName(){
        System.out.println("Животное: " + name);
    }

    public void printCreatedAnimalsCount(){
        System.out.println(animalCount);
    }

    public abstract void run(int runningLength);

    public abstract void swim(int swimmingLength);
}
