package dip.dev.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Acid implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id_acid;
    private String acid_name;
    private String acid_full_name;
    private String acid_description;


    public Acid(String acid_name, String acid_full_name, String acid_description) {
        this.acid_name = acid_name;
        this.acid_full_name = acid_full_name;
        this.acid_description = acid_description;
    }

    public Acid() {

    }

    public Long getId_acid() {
        return id_acid;
    }

    public void setId_acid(Long id_acid) {
        this.id_acid = id_acid;
    }

    public String getAcid_name() {
        return acid_name;
    }

    public void setAcid_name(String acid_name) {
        this.acid_name = acid_name;
    }

    public String getAcid_full_name() {
        return acid_full_name;
    }

    public void setAcid_full_name(String acid_full_name) {
        this.acid_full_name = acid_full_name;
    }

    public String getAcid_description() {
        return acid_description;
    }

    public void setAcid_description(String acid_description) {
        this.acid_description = acid_description;
    }

    @Override
    public String toString() {
        return "acid{" +
                "id_acid=" + id_acid +
                ", acid_name='" + acid_name + '\'' +
                ", acid_full_name='" + acid_full_name + '\'' +
                ", acid_description='" + acid_description + '\'' +
                '}';
    }
}


