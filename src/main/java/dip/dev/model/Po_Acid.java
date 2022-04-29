package dip.dev.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Po_Acid implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id_plant_oil;
    private String acid_name;
    private Float fat_acid_content_min;
    private Float fat_acid_content_max;

    public Po_Acid() {

    }

    public Po_Acid(String acid_name, Float fat_acid_content_min, Float fat_acid_content_max) {
        this.acid_name = acid_name;
        this.fat_acid_content_min = fat_acid_content_min;
        this.fat_acid_content_max = fat_acid_content_max;
    }

    public Long getId_plant_oil() {
        return id_plant_oil;
    }

    public void setId_plant_oil(Long id_plant_oil) {
        this.id_plant_oil = id_plant_oil;
    }

    public String getAcid_name() {
        return acid_name;
    }

    public void setAcid_name(String acid_name) {
        this.acid_name = acid_name;
    }

    public Float getFat_acid_content_min() {
        return fat_acid_content_min;
    }

    public void setFat_acid_content_min(Float fat_acid_content_min) {
        this.fat_acid_content_min = fat_acid_content_min;
    }

    public Float getFat_acid_content_max() {
        return fat_acid_content_max;
    }

    public void setFat_acid_content_max(Float fat_acid_content_max) {
        this.fat_acid_content_max = fat_acid_content_max;
    }

    @Override
    public String toString() {
        return "po_acid{" +
                "id_plant_oil=" + id_plant_oil +
                ", acid_name='" + acid_name + '\'' +
                ", fat_acid_content_min=" + fat_acid_content_min +
                ", fat_acid_content_max=" + fat_acid_content_max +
                '}';
    }
}
