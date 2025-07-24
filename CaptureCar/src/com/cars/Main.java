package com.cars;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Collection<Car> cars = new ArrayList<Car>();

        menuCall(cars);
    }

    public static void menuCall(Collection<Car> cars)
    {
        JOptionPane.showMessageDialog(null, "Welcome to the Car Management App!!");

        String menuOptions = "Select an option:\n" +
                "1] Capture vehicle details\n" +
                "2] View vehicle report\n" +
                "3] Exit app";

        String choice = JOptionPane.showInputDialog(null, menuOptions);
        int menuOption = Integer.parseInt(choice);

        if (menuOption == 1) {
            captureVehicleDetails(cars);

            choice = JOptionPane.showInputDialog(null, menuOptions);
            menuOption = Integer.parseInt(choice);

            if (menuOption == 2) {
                viewVehicleReport(cars);
            } else if (menuOption == 3) {
                JOptionPane.showMessageDialog(null, "Thanks for using the App!");
                System.exit(0);
            }
        } else if (menuOption == 2) {
            viewVehicleReport(cars);

            choice = JOptionPane.showInputDialog(null,menuOptions);
            menuOption = Integer.parseInt(choice);

            if (menuOption == 1){
                captureVehicleDetails(cars);
            } else if (menuOption == 3) {
                JOptionPane.showMessageDialog(null, "Thanks for using the App!");
                System.exit(0);
            }
        }

    }

    private static void captureVehicleDetails(Collection<Car> cars) {
        Car carobj = new Car();

        String make = JOptionPane.showInputDialog(null,"Enter make");

        String model = JOptionPane.showInputDialog(null, "Enter model:");

        String vin = JOptionPane.showInputDialog(null, "Enter VIN [must be 17 characters]:");
        if (vin.length() != 17){
            vin = JOptionPane.showInputDialog(null, "VIN must be 17 characters. Re-enter VIN");
        }

        String plateChoices = JOptionPane.showInputDialog(null, "Select license plate format:\n1 - Old format (e.g. AAA111GP)\n2 - New format (e.g. AA11BBGP)");
        int plateChoice = Integer.parseInt(plateChoices);

        String numberPlate = "";
        if (plateChoice == 1){
            numberPlate = JOptionPane.showInputDialog(null, "Enter old format plate number (e.g. AAA111GP):");
        } else if (plateChoice == 2) {
            numberPlate = JOptionPane.showInputDialog(null, "Enter new format plate number (e.g. AA11BBGP):");
        }

        String mileageStr = JOptionPane.showInputDialog(null, "Enter mileage");
        int mileage = Integer.parseInt(mileageStr);

        String yearStr = JOptionPane.showInputDialog(null,"Enter year:");
        int year = Integer.parseInt(yearStr);

        String regDate = JOptionPane.showInputDialog(null, "Enter registration date [YYYY-MM-DD format]:");
        LocalDate registrationDate = LocalDate.parse(regDate);

        String ownerName = JOptionPane.showInputDialog(null, "Enter owner's name:");

        String color = JOptionPane.showInputDialog(null, "Enter the color of the car:");

        String fuelTypeOptions = "Select fuel type:\n" + "1] Petrol\n" + "2] Diesel\n" + "3] Electric\n" + "4] Hybrid\n" + "5] Other";
        String fuelChoice = JOptionPane.showInputDialog(null, fuelTypeOptions);
        int fuelOption = Integer.parseInt(fuelChoice);

        String fuelType = "";
        if(fuelOption == 1){
            fuelType = "Petrol";
        } else if (fuelOption == 2) {
            fuelType = "Diesel";
        } else if (fuelOption == 3) {
            fuelType = "Electric";
        } else if (fuelOption == 4) {
            fuelType = "Hybrid";
        } else if (fuelOption == 5) {
            fuelType = JOptionPane.showInputDialog(null, "Enter Custom fuel type: ");
        }

        carobj.setMake(make);
        carobj.setModel(model);
        carobj.setNumberPlate(numberPlate);
        carobj.setVin(vin);
        carobj.setYear(year);
        carobj.setMileage(mileage);
        carobj.setRegistrationDate(registrationDate);
        carobj.setOwnerName(ownerName);
        carobj.setColor(color);
        carobj.setFuelType(fuelType);

        cars.add(carobj);

        JOptionPane.showMessageDialog(null, "Vehicle details captured successfully");
        menuCall(cars);
    }

    private static void viewVehicleReport(Collection<Car> cars) {
        if (cars.isEmpty()){
            JOptionPane.showMessageDialog(null, "There are no cars captured");
        }else {
            StringBuilder report = new StringBuilder();
            report.append("Vehicle Report\n");
            report.append("-------------------------------------------\n\n");

            for (Car carObject : cars) {
                report.append("Make: ").append(carObject.getMake()).append("\n");
                report.append("Model: ").append(carObject.getModel()).append("\n");
                report.append("Year: ").append(carObject.getYear()).append("\n");
                report.append("VIN Number: ").append(carObject.getVin()).append("\n");
                report.append("Mileage: ").append(carObject.getMileage()).append("\n");
                report.append("Number Plate: ").append(carObject.getNumberPlate()).append("\n");
                report.append("Registration Date: ").append(carObject.getRegistrationDate()).append("\n");
                report.append("Owner Name: ").append(carObject.getOwnerName()).append("\n");
                report.append("Color: ").append(carObject.getColor()).append("\n");
                report.append("Fuel Type: ").append(carObject.getFuelType()).append("\n");
                report.append("------------------------------\n");
            }

            JOptionPane.showMessageDialog(null, report.toString());
        }
    }
}