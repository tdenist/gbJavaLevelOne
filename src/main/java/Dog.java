public class Dog extends Animal {

    private int maxRunningLength = 500;
    private int maxSwimmingLength = 10;

    public Dog(){
        this.name = "Собака";
    }

    public Dog(String name){
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

        if (swimmingLength > 0 && swimmingLength < maxSwimmingLength)
            System.out.println(name + " проплыл " + swimmingLength + "м.");
        else
            System.out.println(name + " не может проплыть " + swimmingLength + "м.");
    }
}