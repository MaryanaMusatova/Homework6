public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("Задача №2");
        for (int f = 10; f >= 1; f--) {
            System.out.print(f + " ");

        }
        System.out.println(" ");
        System.out.println("Задача №3");
        for (int z = 0; z <= 17; z+=2){
        {System.out.print(z + " ");
        }
       }
            System.out.println(" ");
            System.out.println("Задача №4");
            for (int f = 10; f >= -10; f--) {
                System.out.print(f + " ");
            }

            System.out.println(" ");
            System.out.println("Задача №5");
            for (int year = 1904; year <= 2096; year += 4) {
                System.out.println(year + " год является високосным ");
            }

            System.out.println("Задача №6");
            for (int x = 7; x <= 98; x += 7) {
                System.out.print(x + " ");
            }
            System.out.println(" ");
            System.out.println("Задача №7");
            for (int y = 1; y <= 512; y *= 2) {
                System.out.print(y + " ");
            }

            System.out.println(" ");
            System.out.println("Задача №8");
            int amount = 29000;
            int sum = 0;
            for (int month = 1; month <= 12; month++) {
                sum += amount;
                System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
            }

            System.out.println(" ");
            System.out.println("Задача №9");
            sum = 0;
            double percent = 0.01;
            for (int month = 1; month <= 12; month++) {
                sum += amount;
                sum = (int) (sum * (1 + percent));
                System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
            }

            System.out.println(" ");
            System.out.println("Задача №10");
            for (int multyplier = 1; multyplier <= 10; multyplier++) {
                System.out.printf("%d*%d=%d%n", 2, multyplier, 2 * multyplier);
            }

        }
    }
