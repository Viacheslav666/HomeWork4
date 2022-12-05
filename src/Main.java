import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        task6();
    }

    public static void task1() {

        int age = 17;
        //boolean agePippls  = age>=18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершенолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то не совершонолетний");
        }
    }

    public static void task2() {

        byte outdoorTemperature = 6;
        if (outdoorTemperature > 5) {
            System.out.println("Сегодня тепло " + outdoorTemperature + " градуса , можно идти без шапки");
        }
        if (outdoorTemperature < 5) {
            System.out.println("На улице холодно " + outdoorTemperature + " градуса , нужно надеть шапку");
        } else
            System.out.println("Сиди дома");
    }

    public static void task3() {
        byte driverSpeed = 60;
        if (driverSpeed <= 60) {
            System.out.println("Если скорость " + driverSpeed + " то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + driverSpeed + " плати штраф");
        }
    }

    public static void task4() {
        int age = 10;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }


    }

    public static void task5() {
        int childAge = 3;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему не льзя кататься");
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        else  {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься без сопровождения взрослого");
        }
    }
    public static void task6(){
        int seatInOneCarriage = 102;
        int searingOneCar = 60;
        int standingPlacesOneCar = seatInOneCarriage - searingOneCar;
        int ticketsPurchased = 102;
        boolean freeSeats = ticketsPurchased < searingOneCar && ticketsPurchased < seatInOneCarriage;
        boolean freeStanding = ticketsPurchased >= searingOneCar && ticketsPurchased < seatInOneCarriage;
        int freeSeatsPieces =  (seatInOneCarriage - standingPlacesOneCar) - ticketsPurchased;
        int freeStandingPieces = seatInOneCarriage - ticketsPurchased;

        if (freeSeats) {
            System.out.println(" В вагоне есть свободные сидячие места в количестве " + freeSeatsPieces);

            if (freeStanding)
                System.out.println(" В вагоне есть свободные стоячие  места в количестве " + freeStandingPieces);
        }
        else {
            System.out.println("свободных мест в вагоне нет");
        }
    }
        public static void task7() {
            int one = 35;
            int two = 10;
            int three = 43;
            if (one>two && one >three){
                System.out.println( one + "  One Самаое большое число");

            if (two > one && two > three)
                System.out.println( two + " two Самаое большое число");
            } else
                System.out.println( three + " three Самаое большое число");
        }

}