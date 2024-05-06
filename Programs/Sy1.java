class Bus extends Thread{
    int seat=1,passenger;
    Bus(int passenger)
    {
        this.passenger = passenger;
    }
    @Override
    public synchronized void run()
    {
        String nm = Thread.currentThread().getName();
        if(seat>=passenger)
        {
            System.out.println(nm+"Your ticket is booked.");
            seat = seat-passenger;
        }
        else{
            System.out.println("Sorry Ticket is not available"+nm);
        }
    }

}
class Sy1
{
    public static void main(String[] args) {
        Bus b = new Bus(1);

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();

        t1.setName("Dhaval");
        t1.setName("Keval");
        t1.setName("Jimit");

        t1.start();
        t2.start();
        t3.start();
    }
}