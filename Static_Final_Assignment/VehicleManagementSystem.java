class Vehicle {
    private static double registrationFee = 5000.0;
    private final String registrationNumber;
    private String ownerName, vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("John", "Car", "ABC123");
        car.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000.0);
        car.displayVehicleDetails();
    }
}
