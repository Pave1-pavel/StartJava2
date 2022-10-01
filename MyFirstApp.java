public class MyFirstApp {
    public static void main(String[] args) {

        System.out.println("Задание №1");
        int core = 4;
        float frequency = 2.10f;
        double ram = 13.9d;
        char model = 'g';
        boolean sensor = false;
        long hdd = 1000l;
        short windows = 10;
        byte system = 64;
        System.out.println("Колличество ядер = " + core +
                "\nЧастота процессора = " + frequency +
                "\nМодификация ноутбука = " + model +
                "\nНаличие сенсора = " + sensor +
                "\nОбъем жесткого диска = " + hdd +
                "\nВерсия Windows = " + windows +
                "\nТип системы = " + system + " x разрядный");

        System.out.println("\nЗадание №2");
        int book = 200;
        int pen = 100;
        int sale = (book + pen) * 11 / 100;
        int sumSale = (book + pen) - sale;
        System.out.println("Сумма скидки = " + sale);
        System.out.println("Общая сумма со скидкой = " + sumSale);

        System.out.println("\nЗадание №3");
        System.out.println("    J    a  v     v  a      ");
        System.out.println("    J   a a  v   v  a a    ");
        System.out.println(" J  J  aaaaa  V V  aaaaa   ");
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println("\nЗадание №4");
        int num1 = 214748364;
        byte num2 = 127;
        short num3 = 32767;
        long num4 = 9223372036854775807l;
        System.out.println(num1 + "\n" + num2 + "\n" + num3 + "\n" + num4 + "\n");
        num1++;
        num2++;
        num3++;
        num4++;
        System.out.println(num1 + "\n" + num2 + "\n" + num3 + "\n" + num4 + "\n");

        num1--;
        num2--;
        num3--;
        num4--;
        System.out.println(num1 + "\n" + num2 + "\n" + num3 + "\n" + num4);

        System.out.println("\nЗадание №5");
        int number1 = 2;
        int number2 = 5;
        int number3;
        number3 = number2;
        number2 = number1;
        number1 = number3;
        System.out.println(number1 + " " + number2);
        number3 = number1 - number2;
        number1 -= number3;
        number2 += number3;
        System.out.println(number1 + " " + number2);

        System.out.println("\nЗадача №6");
        char a = 35;
        char b = 38;
        char c = 64;
        char d = 94;
        char i = 95;
        System.out.println("35 = " + a + "\n" +
                "38 = " + b + "\n" +
                "64 = " + c + "\n" +
                "94 = " + d + "\n" +
                "95 = " + i + "\n"
        );

        System.out.println("\nЗадача №7");
        int numu = 123;
        int numuOne = (numu % 10);
        int numuTwo = (numu / 10) % 10;
        int numuThree = (numu / 100);
        System.out.println("Число " + numu + " содержит:\n" +
                numuThree + " сотню \n" +
                numuTwo + " десятки\n" +
                numuOne + " еденицы");

        System.out.println("\nЗадача №8");
        char v = 47; // /
        char n = 92; // \
        char h = 95; // _
        char m = 40; // (
        char j = 41; // )
        System.out.println("             " + v + n);
        System.out.println("            " + v + "  " + n);
        System.out.println("           " + v + h + m + " " + j + n);
        System.out.println("          " + v + "      " + n);
        System.out.println("         " + v + h + h + h + h + v + n + h + h + n);

        System.out.println("\nЗадача №9");
        int numNine = 345;
        int numNineOne = (numNine % 10);
        int numNineTwo = (numNine / 10) % 10;
        int numNineThree = (numNine / 100);
        System.out.println("Сумма цифр числа " + numNine + " = " + (numNineOne + numNineTwo + numNineThree));
        System.out.println("Произведение цифр числа " + numNine + " = " + (numNineOne * numNineTwo * numNineThree));

        System.out.println("\nЗадача №10");
        int time = 86399;
        int hour = time / 3600;
        int minutes = (time % 3600) / 60;
        int second = time % 60;
        System.out.println(hour + ":" + minutes + ":" + second);

    }

}