package dip.dev.repo;

import dip.dev.model.PlantOilAcid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface PlantOilAcidRepo extends JpaRepository<PlantOilAcid, Long> {

    @Transactional
    @Modifying
    @Query("delete from PlantOilAcid p where p.id_acid_plant = ?1")
    void deletePlantOilAcidById_acid_plant(Long id_acid_plant);
}
