import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

public class ObjectToJSONArray {
    public static void main(String[] args) {
        try {
            List<Car> cars = Arrays.asList(
                    new Car("Tata", "Curve", 2025),
                    new Car("Hyundai", "Venue", 2023),
                    new Car("Honda", "Amaze", 2024)
            );

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonArray = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(cars);

            System.out.println(jsonArray);

        } 
		catch (Exception e) {
            e.printStackTrace();
        }
    }
}