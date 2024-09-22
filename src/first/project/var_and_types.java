package first.project;

public class var_and_types {

    public static void main(String[] args) {

        System.out.println("Переменные и типы данных");

        // byte - предназначен для хранения целых чисел. Диапазон чисел от -128 до 127, если число будет большим 127 или меньшим -128. Занимает 1 байт.
        // short - предназначен для хранения целых чисел. Диапазон чисел от -32768 до 32767. Занимает 2 байта.
        // int - предназначен для хранения целых чисел. Диапазон чисел от -2147483648 до 2147483647. Занимает 4 байта.
        // long - предназначен для хранения целых чисел. Диапазон чисел от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807. Занимает 8 байт.

        int age;
            age = 5;
        System.out.println("Возраст пользователя = " + age);

        float num4 = 4.6955845f;
        double num5 = 5.4852684184128451f;

        System.out.println("Переменная float = " + num4);
        System.out.println("Переменная double = " + num5);

        char ch = '&';
        System.out.println("Переменная char = " + ch);

        String user_name = "Ilya";
        System.out.println("Имя пользователя = " + user_name);

        boolean isHappy = false;
        System.out.println("Пользователь счастлив? -" + isHappy);

    }
}