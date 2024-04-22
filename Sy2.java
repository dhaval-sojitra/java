class Movie extends Thread
{
    int ticket=1,person;
    Movie(int person)
    {
        this.person=person;
    }
    public void run()
    {
        String name = Thread.currentThread().getName();
        synchronized(this){
            if(ticket>=person)
            {
                System.out.println("Ticket Booked :"+name);
                ticket = ticket-person;
            }
            else
            {
                System.out.println("Housefull");
            }
        }
    }
}
class Sy2
{
    public static void main(String[] args) {
        Movie m = new Movie(1);

        Thread t1=new Thread(m);
        Thread t2=new Thread(m);
        Thread t3=new Thread(m);

        t1.setName("Bhimsara");
        t2.setName("Jeene nahi duga");
        t3.setName("Marne nahi duga");
        t3.start();
        
        try{
            t3.join();
        }
        catch (InterruptedException ie)
        {
            System.out.println(ie);
        }
        t1.start();
        t2.start();
    }
}