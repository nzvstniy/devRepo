package dip.dev.repo;
import dip.dev.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface SortsRepo extends JpaRepository<Sort, Long> {

    @Transactional
    @Modifying
    @Query("delete from Sort a where a.id_sorts = ?1")
    void deleteSortById_sorts(Long id_sorts);
}