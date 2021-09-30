public class CountPrinter implements Runnable {

    public int n;

    public CountPrinter(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i <= n; i++) {
            System.out.println(i+1);
        }
    }
}
