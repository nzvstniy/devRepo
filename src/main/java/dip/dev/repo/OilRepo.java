package dip.dev.repo;

import dip.dev.model.Acid;
import dip.dev.model.Oil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface OilRepo extends JpaRepository<Oil, Long> {

    @Transactional
    @Modifying
    @Query("delete from Oil o where o.id_oil = ?1")
    void deleteOilById_oil(Long id_oil);
}
