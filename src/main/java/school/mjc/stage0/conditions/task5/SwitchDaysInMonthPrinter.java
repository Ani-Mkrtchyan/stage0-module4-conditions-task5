package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("The Month has 31 days");
            case 4, 6, 9, 11 -> System.out.println("The Month has 30 days");
            case 2 -> System.out.println("The Month has 28 or 29 days");
            default -> System.out.println("wrong number");
        }
    }

    public static void main(String[] args) {
        SwitchDaysInMonthPrinter switchDaysInMonthPrinter = new SwitchDaysInMonthPrinter();
        switchDaysInMonthPrinter.amountOfDays(12);
        switchDaysInMonthPrinter.amountOfDays(16);
    }
}
