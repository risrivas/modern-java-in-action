package org.rishi;

/**
 * Created by rishi on 16/06/2021
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(getCarInsuranceName(new Person()));
    }

    public static String getCarInsuranceName(Person person) {
        if (person != null) {
            Car car = person.getCar();
            if (car != null) {
                Insurance insurance = car.getInsurance();
                if (insurance != null) {
                    return insurance.getName();
                }
            }
        }

        return "Unknown";
    }

}
