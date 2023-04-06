class Simple {
    public static void main(String args[]) {
        int x = 10;
        int y = 7;
        int sum = x + y;
        int day = 2;
        String dayType;
        String dayString;
        if (sum > 20) {
            System.out.println("x+y is greater then 20");
        } else {
            System.out.println("its not");
        }
        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;

            default:
                dayString = "No day";
                break;
        }
        switch (day) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                dayType = "Weekday";
                break;
            case 6:

            case 7:
                dayType = "Weekend";
                break;

            default:
                dayType = "No day";
                break;
        }
        for (int j = 1; j<=10; j++) {
            for (int k = 1; k<= j; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("Today is " + dayString + "and its a " + dayType);
        System.out.println("Hello Java");
        System.out.println("Learning Java Programming");

    }
}