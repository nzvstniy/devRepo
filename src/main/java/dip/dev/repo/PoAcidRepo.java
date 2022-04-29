package dip.dev.repo;

import dip.dev.model.Acid;
import dip.dev.model.Po_Acid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface PoAcidRepo extends JpaRepository<Po_Acid, Long> {

    @Transactional
    @Modifying
    @Query("delete from Po_Acid p where p.id_plant_oil = ?1")
    void deletePo_AcidById_plant_oil(Long id_plant_oil);
}
