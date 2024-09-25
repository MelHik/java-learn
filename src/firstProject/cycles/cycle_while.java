package firstProject.cycles;

public class cycle_while {
    public static void main(String[] args) {
        int i = 10;

        while (i >= 1) {
            System.out.println("Element: " + i);
            i--;
            try {
                Thread.sleep(1000); // Задержка в 1 секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        if (i == 0)
            System.out.println("Why a u gay?");
        }
    }
}
