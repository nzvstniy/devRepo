package dip.dev.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class PlantOilAcid implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id_acid_plant;
    private String name_oils;
    private String name_acids;
    private String fat_acid_content_min;
    private String fat_acid_content_max;


    public PlantOilAcid(String name_oils, String name_acids, String fat_acid_content_min, String fat_acid_content_max) {
        this.name_acids = name_acids;
        this.name_oils = name_oils;
        this.fat_acid_content_min = fat_acid_content_min;
        this.fat_acid_content_max = fat_acid_content_max;
    }

    public PlantOilAcid() {

    }

    public Long getId_acid_plant() {
        return id_acid_plant;
    }

    public void setId_acid_plant(Long id_acidPlant) {
        this.id_acid_plant = id_acidPlant;
    }

    public String getName_oils() {
        return name_oils;
    }

    public void setName_oils(String String) {
        this.name_oils = String;
    }

    public String getName_acids() {
        return name_acids;
    }

    public void setName_acids(String nameAcids) {
        this.name_acids = nameAcids;
    }

    public String getFat_acid_content_min() {
        return fat_acid_content_min;
    }

    public void setFat_acid_content_min(String acid_full_name) {
        this.fat_acid_content_min = acid_full_name;
    }

    public String getFat_acid_content_max() {
        return fat_acid_content_max;
    }

    public void setFat_acid_content_max(String acid_description) {
        this.fat_acid_content_max = acid_description;
    }

    @Override
    public String toString() {
        return "Acid{" +
                "id_acidPlant=" + id_acid_plant +
                ", name_oils=" + name_oils + '\'' +
                ", nameAcids='" + name_acids + '\'' +
                ", acid_full_name='" + fat_acid_content_min + '\'' +
                ", acid_description='" + fat_acid_content_max + '\'' +
                '}';
    }
}
