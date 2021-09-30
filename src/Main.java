public class Main {
    public static void main(String[] args) {
        DatePrinter datep=new DatePrinter(19); //bei hohen n wird das Schalten zwischen den Threads erkennbar.
        Thread th1=new Thread(datep);                //Die 20 Durchläufe werden so schnell abgearbeitet, dass zwischen den Threads nicht gewechselt wird.

        System.out.println();

        CountPrinter countp=new CountPrinter(19);
        Thread th2=new Thread(countp);

        th1.start();
        th2.start();
    }
}
