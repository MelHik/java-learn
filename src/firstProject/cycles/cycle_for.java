package firstProject.cycles;

public class cycle_for {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Element: " + i);
            if (i == 1) {
                System.out.println("Why a u gay? :*");
            }
            try {
                Thread.sleep(1000); // Задержка в 1 секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
