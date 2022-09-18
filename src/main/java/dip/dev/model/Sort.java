package dip.dev.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Sort implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id_sorts;
    private String sort_name;

    public Sort() {

    }

    public Sort(String sort_name) {
        this.sort_name = sort_name;

    }

    public Long getId_sorts() {
        return id_sorts;
    }

    public void setId_sorts(Long id_sorts) {
        this.id_sorts = id_sorts;
    }

    public String getSort_name() {
        return sort_name;
    }

    public void setSort_name(String sort_name) {
        this.sort_name = sort_name;
    }

    @Override
    public String toString() {
        return "Sort{" +
                "id_sorts=" + id_sorts +
                ", sort_name='" + sort_name + '\'' +
                '}';
    }

}
