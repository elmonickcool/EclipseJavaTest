import java.util.Scanner;

public class DateFormatter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("***Date Formatter***");

        System.out.print("Month: ");
        int month = s.nextInt();

        System.out.print("Day: ");
        int day = s.nextInt();

        System.out.print("Year: ");
        int year = s.nextInt();
        System.out.println("***************");

        boolean isValidDay = true;

        // Switch statement to determine the month and format the date
        switch (month) {

            case 1:
                if (day < 1 || day > 31) {
                    isValidDay = false;
                } else {
                    System.out.print("January " + day + " " + year);
                }
                break;

            case 2:
                int maxDayFeb = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
                if (day < 1 || day > maxDayFeb) {
                    isValidDay = false;
                } else {
                    System.out.print("February " + day + " " + year);
                }
                break;

            case 3:
                if (day < 1 || day > 31) {
                    isValidDay = false;
                } else {
                    System.out.print("March " + day + " " + year);
                }
                break;

            case 4:
                if (day < 1 || day > 30) {
                    isValidDay = false;
                } else {
                    System.out.print("April " + day + " " + year);
                }
                break;

            case 5:
                if (day < 1 || day > 31) {
                    isValidDay = false;
                } else {
                    System.out.print("May " + day + " " + year);
                }
                break;

            case 6:
                if (day < 1 || day > 30) {
                    isValidDay = false;
                } else {
                    System.out.print("June " + day + " " + year);
                }
                break;

            case 7:
                if (day < 1 || day > 31) {
                    isValidDay = false;
                } else {
                    System.out.print("July " + day + " " + year);
                }
                break;

            case 8:
                if (day < 1 || day > 31) {
                    isValidDay = false;
                } else {
                    System.out.print("August " + day + " " + year);
                }
                break;

            case 9:
                if (day < 1 || day > 30) {
                    isValidDay = false;
                } else {
                    System.out.print("September " + day + " " + year);
                }
                break;

            case 10:
                if (day < 1 || day > 31) {
                    isValidDay = false;
                } else {
                    System.out.print("October " + day + " " + year);
                }
                break;

            case 11:
                if (day < 1 || day > 30) {
                    isValidDay = false;
                } else {
                    System.out.print("November " + day + " " + year);
                }
                break;

            case 12:
                if (day < 1 || day > 31) {
                    isValidDay = false;
                } else {
                    System.out.print("December " + day + " " + year);
                }
                break;

            default:
                System.out.println("Invalid Month");
        }

        if (!isValidDay) {
            System.out.println("Invalid Day for Given Month");
        }

        s.close();
    }
}
