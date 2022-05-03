package dip.dev.repo;

import dip.dev.model.OilAcid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface OilAcidRepo extends JpaRepository<OilAcid, Long> {

    @Transactional
    @Modifying
    @Query("delete from OilAcid o where o.id_acid_oil = ?1")
    void deleteOilAcidById_acid_oil(Long id_acid_oil);



}
