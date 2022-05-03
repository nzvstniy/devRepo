package dip.dev.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity

public class OilAcid implements Serializable  {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id_acid_oil;
    private Long id_oils;
    private String name_acids;
    private Float acid_value;

    public OilAcid() {

    }
    public OilAcid(Long id_oils, String name_acids, Float acid_value) {
        this.id_oils = id_oils;
        this.name_acids = name_acids;
        this.acid_value = acid_value;
    }

    public Long getId_acid_oil() {
        return id_acid_oil;
    }

    public void setId_acid_oil(Long id_acid_oil) {
        this.id_acid_oil = id_acid_oil;
    }

    public Long getId_oils() {
        return id_oils;
    }

    public void setId_oils(Long id_oils) {
        this.id_oils = id_oils;
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
                ", id_oils=" + id_oils +
                ", name_acids='" + name_acids + '\'' +
                ", acid_value=" + acid_value +
                '}';
    }
}
