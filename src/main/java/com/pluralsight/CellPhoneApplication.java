
package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cp1 = new CellPhone();
        CellPhone cp2 = new CellPhone();

        cp2.setOwner("Erick");



        System.out.println("Enter your cellphone information:");

        int serialNumber = Console.promptForInt("Serial number: ");
        cp1.setSerialNumber(serialNumber);

        String model = Console.promptForString("Model: ");
        cp1.setModel(model);

        String carrier = Console.promptForString("Carrier: ");
        cp1.setCarrier(carrier);

        String phoneNumber = Console.promptForString("Phone number: ");
        cp1.setPhoneNumber(phoneNumber);

        String owner = Console.promptForString("Owner: ");
        cp1.setOwner(owner);

        System.out.println("\nCell Phone Information:");
        System.out.println("Serial Number: " + cp1.getSerialNumber());
        System.out.println("Model: " + cp1.getModel());
        System.out.println("Carrier: " + cp1.getCarrier());
        System.out.println("Phone Number: " + cp1.getPhoneNumber());
        System.out.println("Owner: " + cp1.getOwner());

        cp1.dial("532-486-5932");
    }
}
