//Some Workers can be Workaholics
class Workaholic extends Worker{

    //Workaholic constructors have to construct a worker class first, but also take a parameter for overtime
    public Workaholic(String name, int age, float hourlyIncome, int time, Worker coWorker, int OVERTIME) {
        super(name, age, hourlyIncome, time, coWorker);
        this.OVERTIME = OVERTIME;
    }

public static void main(String[] args) {
    
    //Now we can create our workers and workaholics 
    Worker Jeff = new Worker("Jeff", 40, 20, 160, null);
    Worker Sarah = new Worker("Sarah", 41, 20, 160, Jeff); 
    Workaholic Oisin = new Workaholic("Oisin", 32, 20, 160, null, 80);
    
    //Now we can make Jeff, Sarah, and Oisin work their hours worked
    Jeff.work(Jeff.getTime());
    Sarah.work(Sarah.getTime());
    Oisin.work(Oisin.getTime());
    
    //And we can print how much they each earned
     System.out.println(Jeff.info());
     System.out.println(Sarah.info());
     System.out.println(Oisin.info());
    
    }
     }