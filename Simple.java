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
        System.out.println("Today is " + dayString);
        System.out.println("Hello Java");
        System.out.println("Learning Java Programming");

    }
}