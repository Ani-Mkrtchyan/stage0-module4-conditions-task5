package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The Month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The Month has 30 days");
                break;
            case 2:
                System.out.println("The Month has 28 or 29 days");
                break;
            default:
                System.out.println("wrong number");
                break;
        }
    }

    public static void main(String[] args) {
        SwitchDaysInMonthPrinter switchDaysInMonthPrinter = new SwitchDaysInMonthPrinter();
        switchDaysInMonthPrinter.amountOfDays(12);
        switchDaysInMonthPrinter.amountOfDays(16);
    }
}
