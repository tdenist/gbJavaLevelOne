public class Cat extends Animal{

    private int maxRunningLength = 200;

    public Cat(){
        this.name = "Кот";
    }

    public Cat(String name){
        this.name = name;
    }

    @Override
    public void run(int runningLength){

        if (runningLength > 0 && runningLength < maxRunningLength)
            System.out.println(name + " пробежал " + runningLength + "м.");
        else
            System.out.println(name + " не может пробежать " + runningLength + "м.");
    }

    @Override
    public void swim(int swimmingLength){

        System.out.println(name + " не умеет плавать");
    }
}
