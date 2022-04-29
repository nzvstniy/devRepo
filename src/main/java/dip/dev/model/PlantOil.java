package dip.dev.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity

public class PlantOil implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id_plant_oil;
    private String plant_oil_name;
    private String plant_oil_description;

    public PlantOil() {

    }

    public PlantOil(String plant_oil_name, String plant_oil_description) {
        this.plant_oil_name = plant_oil_name;
        this.plant_oil_description = plant_oil_description;
    }

    public Long getId_plant_oil() {
        return id_plant_oil;
    }

    public void setId_plant_oil(Long id_plant_oil) {
        this.id_plant_oil = id_plant_oil;
    }

    public String getPlant_oil_name() {
        return plant_oil_name;
    }

    public void setPlant_oil_name(String plant_oil_name) {
        this.plant_oil_name = plant_oil_name;
    }

    public String getPlant_oil_description() {
        return plant_oil_description;
    }

    public void setPlant_oil_description(String plant_oil_description) {
        this.plant_oil_description = plant_oil_description;
    }

    @Override
    public String toString() {
        return "plant_oil{" +
                "id_plant_oil=" + id_plant_oil +
                ", plant_oil_name='" + plant_oil_name + '\'' +
                ", plant_oil_description='" + plant_oil_description + '\'' +
                '}';
    }
}
