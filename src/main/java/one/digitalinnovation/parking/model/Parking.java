package one.digitalinnovation.parking.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
public class Parking {
    private String id;
    private String license;
    private String state;
    private String model;
    private String color;
    private LocalTime entryDate;
    private LocalTime exitDate;
    private Double bill;

    public Parking(String id, String license, String state, String model, String color) {
        this.id = id;
        this.license = license;
        this.state = state;
        this.model = model;
        this.color = color;
    }
}
