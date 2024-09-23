package firstProject.ifElse;

public class Consntruction {
    public static void main(String[] args) {
        int a = 15, b = 10;
        /* Условные операторы для if-else:
            > - больше
            < - меньше
            >= - больше или равно
            <= - меньше или равно
            == - равно
            != - не равно
         */
        if (a > b) {
            System.out.println("a > b");
        }

        char sym1 = 'A', sym2 = 'a';
        if(sym1 == sym2) {

            System.out.println("Символы одинаковы");
        } else {
            System.out.println("Символы не равны");
        }
        boolean isTrue = true;
        /*
            переменные типа boolean сами по себе являются условием и не обязательно писать
            операторы условий. Просто указание переменной проверяет на true (== true), указание переменный с '!' проверяет на false (== false)
            Также внутри оператора if можно указать несколько условий посредство && (и) или || (или)
         */
        if (!isTrue) {
            System.out.println("Boolean = false");
        } else {
            System.out.println("Boolean = true");
        }
    }
}
