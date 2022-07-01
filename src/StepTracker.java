public class StepTracker {

    MonthData[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    int goal = 10000;

    class MonthData {
        int[] days;

        MonthData() {
            days = new int[30];
            for (int i = 0; i < 30; i++) {
                days[i] = 0;
            }
            // Заполните класс самостоятельно
        }
    }

    int[] stepInMonth = new int[12];

    void stepInDay(int day, int month, int step) {
     if (day<1){System.out.println("В месяце 30 дней, введите цифру больше 0");}
             else if (day>30){System.out.println("В месяце 30 дней, введите цифру меньше 30");}
             else if (month<1){System.out.println("В году 12 месяцев, введите цифру больше 0");}
             else if (month>12){System.out.println("В году 12 месяцев, введите цифру меньше 12");}
             else if (step<0){System.out.println("Шагов может быть не меньше 0 ");}
             else{
  monthToData[month-1].days[day - 1] = monthToData[month-1].days[day - 1] + step;
        stepInMonth[month-1] = monthToData[month-1].days[day - 1] + stepInMonth[month-1];
        System.out.println("Значение сохранено, вы прошли " + monthToData[month-1].days[day - 1] + " шагов.");}
        return;
    }

    void statisticscMonth(int month) {
        System.out.println("За этот месяц вы прошли " + stepInMonth[month-1] + " шагов.");
        System.out.println("За этот месяц вы сожгли " + stepInMonth[month-1]*0.05 + " киллокалорий.");
        System.out.println("За этот месяц вы прошли " + stepInMonth[month-1]*0.075 + " киломметров.");
        for (int i = 0; i < 30; i++) {
            System.out.println("В день " + (i + 1) + ". Пойдено " + monthToData[month-1].days[i] + " шагов");
        }
    }

    void calcMaxStreak(int month) {

        int maxStreak = 0;
        int curStreak = 0;
        int daysFull = 0;
        for (int i = 0; i < 30; i++) {
            if (monthToData[month-1].days[i] == 0) {
                curStreak = 0;
                daysFull = daysFull + 0;
            } else {
                curStreak++;
                daysFull++;
            }
            if (curStreak > maxStreak) {
                maxStreak = curStreak;
            }

        }
        System.out.println("За этот месяц лучшая серия дней подряд: " + maxStreak);
        System.out.println("Среднее количество шагов в день за месяц: " + stepInMonth[month] / daysFull);
    }

    void changeGoal(int newGoal) {
        if (newGoal > 0) {
            goal = newGoal;
        } else {
            System.out.println("Хватит лениться, нужно вводить положительно значение!");
        }

    }
}














