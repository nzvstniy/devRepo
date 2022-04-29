package dip.dev.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Oil implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id_oil;
    private String oil_name;
    private String oil_country;
    private String oil_maker;
    private String oil_sort;
    private String oil_note;

    public Oil() {

    }

    public Oil(String oil_name, String oil_country, String oil_maker, String oil_sort, String oil_note) {
        this.oil_name = oil_name;
        this.oil_country = oil_country;
        this.oil_maker = oil_maker;
        this.oil_sort = oil_sort;
        this.oil_note = oil_note;
    }

    public Long getId_oil() {
        return id_oil;
    }

    public void setId_oil(Long id_oil) {
        this.id_oil = id_oil;
    }

    public String getOil_name() {
        return oil_name;
    }

    public void setOil_name(String oil_name) {
        this.oil_name = oil_name;
    }

    public String getOil_country() {
        return oil_country;
    }

    public void setOil_country(String oil_country) {
        this.oil_country = oil_country;
    }

    public String getOil_maker() {
        return oil_maker;
    }

    public void setOil_maker(String oil_maker) {
        this.oil_maker = oil_maker;
    }

    public String getOil_sort() {
        return oil_sort;
    }

    public void setOil_sort(String oil_sort) {
        this.oil_sort = oil_sort;
    }

    public String getOil_note() {
        return oil_note;
    }

    public void setOil_note(String oil_note) {
        this.oil_note = oil_note;
    }

    @Override
    public String toString() {
        return "oil{" +
                "id_oil=" + id_oil +
                ", oil_name='" + oil_name + '\'' +
                ", oil_country='" + oil_country + '\'' +
                ", oil_maker='" + oil_maker + '\'' +
                ", oil_sort='" + oil_sort + '\'' +
                ", oil_note='" + oil_note + '\'' +
                '}';
    }
}
