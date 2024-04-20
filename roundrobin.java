class getname extends Thread {

    public void run() {
        // String guss = "";
        String[] arr = { "Dhaval", "Yash", "Mahavir" ,"Rahul","Masot" };
        String nm = "Dhaval";
        String name = Thread.currentThread().getName();
        try {
            for (int i = 0; i < arr.length; i++) {
                // System.out.println(arr[i]);
                if(nm.equals(arr[i])) {
                    System.out.println("Yash is Avilable");
                    break;

                }
                else{
                    System.out.println("Yash is not Avilable");
                    break;
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }
}

class roundrobin {
    public static void main(String[] args) {
        getname g = new getname();
        g.setName("Yash");
        g.start();
    }
}