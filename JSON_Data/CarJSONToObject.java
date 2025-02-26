import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

class Car{
    private String name;
    private String brand;
    private int year;
    public Car(String name,String brand,int year){
        this.name=name;
        this.brand=brand;
        this.year=year;
    }
    public String getName(){
        return name;
    }
    public String getBrand(){
        return brand;
    }
    public int getYear(){
        return year;
    }
}
public class CarJSONToObject{
    public static void main(String[] args) {
        try {Car car=new Car("Toyota", "Corolla",2025);
        ObjectMapper objectMapper=new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(car);
        System.out.println(jsonString);
    } 
	catch (Exception e) {
        e.printStackTrace();
    }
}
}