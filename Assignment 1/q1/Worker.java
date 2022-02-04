//Worker is the primary class. Not ever Worker is a Workaholic but every Workaholic is a Worker!!
public class Worker{

    public static final int RETIREMENT_AGE = 65; 
    protected String name = null;
    protected int age = 0; 
    protected Worker coWorker = null;
    protected float earned = 0.0f;
    protected float hourlyIncome = 0.0f;
    protected int time; 
    protected int OVERTIME = 0;

    
        //Every Worker requires a name, age, hourly wage, hours clocked, and can be assigned a coWorker
        public Worker(String name, int age, float hourlyIncome, int time, Worker coWorker) {
            this.name = name;
            this.hourlyIncome = hourlyIncome;
            this.age = age;
            this.time = time;
            this.coWorker = coWorker;
        }
        
        //The work(), work(int) and delegate() methods can be condensed into, work(int) and addHour(int)
                
        //In the work(int) method we first check to see if there worker calling the method has worked overtime

        //Then we can add up time on call and time worked overtime to get a tally of hours worked in total

        //I don't entirely understand the purpose of the delegate() function in this scenario but we can achieve
        //the same functionality by including it in the work(int) function. If the worker has a coworker and has
        //worked a multiple of 5 hours, one hour is delegated to the Worker's coworker 
        public void work(int hours) {

            while(age++ < RETIREMENT_AGE){
                
                if(this.OVERTIME > 0){
                    this.earned += (this.OVERTIME * hourlyIncome);
                }

                if(this.time > 0){
                    this.earned += (this.time * hourlyIncome);    
                }
                
                if(this.coWorker!=null && this.time%5==0){
                        this.coWorker.addHour(1);
                }

            }
        
        }   

        //Add hour method is used in the work method above, but can be used in other contexts and so remains included
        private void addHour(int hours) {
            this.earned += this.hourlyIncome;
        }
        
        //Because a getter for the worker.time variable seems like it would come in handy for applications other than
        //what we're doing in our main method, I wanted to include this as well
        public int getTime(){
            return this.time;
        }
        
        //Info is a basic toString method
        public String info() {
         return this.name + " worked: " + this.time + " hours at " + hourlyIncome + " an hour and earned: " + this.earned;
        }
    }      
