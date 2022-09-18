package dip.dev.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity

public class OilAcid implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id_acid_oil;
    private String oil_names;
    private String oils_sort;
    private String name_acids;
    private Float acid_value;

    public OilAcid() {

    }
    public OilAcid(String oil_names, String oils_sort, String name_acids, Float acid_value) {
        this.oil_names = oil_names;
        this.oils_sort=oils_sort;
        this.name_acids = name_acids;
        this.acid_value = acid_value;
    }

    public Long getId_acid_oil() {
        return id_acid_oil;
    }

    public void setId_acid_oil(Long id_acid_oil) {
        this.id_acid_oil = id_acid_oil;
    }

    public String getOil_names() {
        return oil_names;
    }

    public void setOil_names(String oil_names) {
        this.oil_names = oil_names;
    }
    public String getOils_sort() {
        return oils_sort;
    }

    public void setOils_sort(String oils_sort) {
        this.oils_sort = oils_sort;
    }

    public String getName_acids() {
        return name_acids;
    }

    public void setName_acids(String name_acids) {
        this.name_acids = name_acids;
    }

    public Float getAcid_value() {
        return acid_value;
    }

    public void setAcid_value(Float acid_value) {
        this.acid_value = acid_value;
    }

    @Override
    public String toString() {
        return "Oil_acid{" +
                "id_acid_oil=" + id_acid_oil +
                ", oil_names=" + oil_names + '\'' +
                ", oils_sort=" + oils_sort + '\'' +
                ", name_acids='" + name_acids + '\'' +
                ", acid_value=" + acid_value +
                '}';
    }
}
