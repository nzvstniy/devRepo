package dip.dev.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity

public class O_Acid implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id_oil;
    private String acid_name;
    private Float acid_value;

    public O_Acid() {

    }
    public O_Acid(String acid_name, Float acid_value) {

        this.acid_name = acid_name;
        this.acid_value = acid_value;
    }

    public Long getId_oil() {
        return id_oil;
    }

    public void setId_oil(Long id_oil) {
        this.id_oil = id_oil;
    }

    public String getAcid_name() {
        return acid_name;
    }

    public void setAcid_name(String acid_name) {
        this.acid_name = acid_name;
    }

    public Float getAcid_value() {
        return acid_value;
    }

    public void setAcid_value(Float acid_value) {
        this.acid_value = acid_value;
    }

    @Override
    public String toString() {
        return "o_acid{" +
                "id_oil=" + id_oil +
                ", acid_name='" + acid_name + '\'' +
                ", acid_value=" + acid_value +
                '}';
    }
}
