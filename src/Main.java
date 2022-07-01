import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker  stepTracker = new StepTracker ();
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if (userInput == 1){
                System.out.println("За какой день вносим шаги?");
                int day = scanner.nextInt();
                 System.out.println("В каком месяце этот день?");
                int month= scanner.nextInt();
                System.out.println("Сколько шагов прошли?");
                int step= scanner.nextInt();
                stepTracker.stepInDay(day,month,step);
            } else if (userInput == 2){
                System.out.println("За какой месяц вы хотите увидеть статистику?");
                int month= scanner.nextInt();
                stepTracker.statisticscMonth(month);
                stepTracker.calcMaxStreak(month);



            }else if (userInput == 3){
                System.out.println("Введите новую цель: ");
                int newGoal =scanner.nextInt();
          stepTracker.changeGoal(newGoal);
            }else {
                System.out.println("Такой команды нет");
return;
            }

            printMenu(); // печатаем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя
        }
        System.out.println("Программа завершена");
    }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");
    }







}