package AirportTest;

import Plane.Plane;
import PlaneService.PlanesService;

public class Main {
    public static void main(String[] args) {
        PlanesService service = new PlanesService();
        Plane plane1 = service.create();
        Plane plane2 = service.create();
        Plane plane3 = service.create();
        Plane[] planes = {plane1, plane2, plane3};
        System.out.println("_-_-_-_-_-_-_-_-_-_-");
        plane1.printInfo();

    }
}
