package dip.dev.repo;

import dip.dev.model.Acid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface AcidRepo extends JpaRepository<Acid, Long> {

    @Transactional
    @Modifying
    @Query("delete from Acid a where a.id_acid = ?1")
    void deleteAcidById_acid(Long id_acid);
}
