
interface IWorkable {
    void work();
}

interface IEatable {
    void eat();
}

interface ISleepable {
    void sleep();
}

class HumanWorker implements IWorkable, IEatable, ISleepable {
    @Override
    public void work() {
        System.out.println("Человек работает.");
    }

    @Override
    public void eat() {
        System.out.println("Человек ест.");
    }

    @Override
    public void sleep() {
        System.out.println("Человек спит.");
    }
}

class RobotWorker implements IWorkable {
    @Override
    public void work() {
        System.out.println("Робот работает.");
    }
}

public class Main_2 {
    public static void main(String[] args) {
        IWorkable human = new HumanWorker();
        human.work();

        IEatable eatableHuman = (IEatable) human;
        eatableHuman.eat();

        ISleepable sleepableHuman = (ISleepable) human;
        sleepableHuman.sleep();

        IWorkable robot = new RobotWorker();
        robot.work();
    }
}
