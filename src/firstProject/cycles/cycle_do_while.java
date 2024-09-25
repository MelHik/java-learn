package firstProject.cycles;

public class cycle_do_while {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("Seconds: " + i);
            try {
                Thread.sleep(1000); // Задержка в 1 секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
        } while (i >= 1);
        System.out.println("Why a u gay?");
    }
}
