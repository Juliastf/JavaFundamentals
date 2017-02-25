package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by nikijul on 04.02.2017.
 */
public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        HashSet<String> cars=new HashSet<>();

        while(true){
            String input=scanner.nextLine();
            if (input.equals("END")){
                break;
            }
            else   {
                String[] inputCar=input.split(", ");
                if (inputCar[0].equals("IN")){
                    cars.add(inputCar[1]);
                }
                else if (inputCar[0].equals("OUT")){
                    cars.remove(inputCar[1]);
                }
            }
        }

        if (cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }
        else {
            for (String car : cars) {
                System.out.println(car);

            }
        }
    }
}
