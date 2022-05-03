package dip.dev.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class PlantOilAcid implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id_acid_plant;
    private Long id_plants;
    private String name_acids;
    private String fat_acid_content_min;
    private String fat_acid_content_max;


    public PlantOilAcid(Long id_plants, String name_acids, String fat_acid_content_min, String fat_acid_content_max) {
        this.name_acids = name_acids;
        this.id_plants = id_plants;
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

    public Long getId_plants() {
        return id_plants;
    }

    public void setId_plants(Long idPlants) {
        this.id_plants = idPlants;
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
                ", idPlants=" + id_plants +
                ", nameAcids='" + name_acids + '\'' +
                ", acid_full_name='" + fat_acid_content_min + '\'' +
                ", acid_description='" + fat_acid_content_max + '\'' +
                '}';
    }
}
