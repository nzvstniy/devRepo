package dip.dev.repo;

import dip.dev.model.Acid;
import dip.dev.model.PlantOil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface PlantOilRepo extends JpaRepository<PlantOil, Long> {

    @Transactional
    @Modifying
    @Query("delete from PlantOil p where p.id_plant_oil = ?1")
    void deletePlantOilById_plant_oil(Long id_plant_oil);
}
