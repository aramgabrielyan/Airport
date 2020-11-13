package PlaneService;

import Plane.Plane;

import java.util.Scanner;

public class PlanesService {

//    Task 1. (score 5)
//    Create function:
//    Parameter one Plane
//    Result: print all information of the plane

    public Plane create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Model");
        String model = scanner.next();
        System.out.println("Enter Country");
        String country = scanner.next();
        System.out.println("Enter Year");
        int year = scanner.nextInt();
        System.out.println("Enter Hours");
        int hours = scanner.nextInt();
        System.out.println("Enter is Military - 'y/n'");
        boolean isMilitary = scanner.next().charAt(0) == 'y';
        System.out.println("Enter Weight");
        int weight = scanner.nextInt();
        System.out.println("Enter Wingspan");
        int wingspan = scanner.nextInt();
        System.out.println("Enter Top Speed");
        int topSpeed = scanner.nextInt();
        System.out.println("Enter Number of Seats");
        int seats = scanner.nextInt();
        System.out.println("Enter Cost");
        double cost = scanner.nextDouble();
        return new Plane(model, country, year, hours, isMilitary, weight, wingspan, topSpeed, seats, cost);
    }

    //    Task 2. (score 5)
//    Create function:
//    Parameter one Plane
//    Result: print cost and topSpeed if the plane is military otherwise print model and country
    public void printCostAndTopSpeed(Plane pl1) {
        if (pl1.isMilitary()) {
            System.out.println("**************************");
            System.out.println(pl1.getCost() + " " + pl1.getTopSpeed());
        } else {
            System.out.println(pl1.getModel() + " " + pl1.getCountry());
        }
    }

    //    Task 3. (score 7)
//    Create function:
//    Parameter two Planes
//    Result: return the plane which one is newer (if they have the same age return first one).
    public Plane newerPlane(Plane pl1, Plane pl2) {
        if (pl1.getYear() < pl2.getYear()) {
            return pl1;
        } else {
            if (pl1.getYear() > pl2.getYear()) {
                return pl2;
            } else {
                return pl1;
            }
        }
    }

    //    Task 4. (score 7)
//    Create function:
//    Parameter two Planes
//    Result: return the model of the plane which has bigger wingspan (if they have the same - return second one).
    public Plane biggerWingspan(Plane pl1, Plane pl2) {
        if (pl1.getWingspan() < pl2.getWingspan()) {
            return pl1;
        } else {
            if (pl1.getYear() > pl2.getYear()) {
                return pl2;
            } else {
                return pl2;
            }
        }
    }

    //    Task 5. (score 7)
//    Create function:
//    Parameter three Planes
//    Result: print country of the plane with smallest seats count (if they have the same - print first).
    public void smallestSeatsCount(Plane pl1, Plane pl2, Plane pl3) {
        if (pl1.getSeats() < pl2.getSeats() && pl1.getSeats() < pl3.getSeats()) {
            System.out.println(pl1.getCountry());
        } else {
            if (pl2.getSeats() < pl1.getSeats() && pl2.getSeats() < pl3.getSeats()) {
                System.out.println(pl2.getCountry());
            } else {
                if (pl3.getSeats() < pl1.getSeats() && pl3.getSeats() < pl2.getSeats()) {
                    System.out.println(pl3.getCountry());
                } else {
                    System.out.println(pl1.getCountry());
                }
            }
        }
    }

    //    Task 6. (score 7)
//    Create function:
//    Parameter array of Planes
//    Result: print all not military planes.
    public void notMilitary(Plane[] planes) {
        for (Plane p : planes) {
            if (!p.isMilitary()) {
                System.out.println("******************");
                p.printInfo();
            }
        }
    }

    //    Task 7. (score 10)
//    Create function:
//    Parameter array of Planes
//    Result: print all military planes which were in air more than 100 hours.
    public void militaryMore100(Plane[] planes) {
        for (Plane p : planes) {
            if (p.isMilitary() && p.getHours() > 100) {
                System.out.println("******************");
                p.printInfo();
            }
        }
    }

    //    Task 8. (score 10)
//    Create function:
//    Parameter array of Planes
//    Result: return the plane with minimal weight (if there are some of them return last one).
    public Plane minimalWeight(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getWeight() > min.getWeight()) {
                min = planes[i];
            }
        }
        return min;
    }

    //    Task 9. (score 10)
//    Create function:
//    Parameter array of Planes
//    Result: return the plane with minimal cost from all military planes (if there are some of them return first one).


}

