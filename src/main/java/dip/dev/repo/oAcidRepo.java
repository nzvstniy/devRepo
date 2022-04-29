package dip.dev.repo;

import dip.dev.model.Acid;
import dip.dev.model.O_Acid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface oAcidRepo extends JpaRepository<O_Acid, Long> {

    @Transactional
    @Modifying
    @Query("delete from O_Acid o where o.id_oil = ?1")
    void deleteO_AcidById_oil(Long id_oil);
}
