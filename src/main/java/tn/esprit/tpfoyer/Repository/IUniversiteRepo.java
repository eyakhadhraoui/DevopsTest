package tn.esprit.tpfoyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entity.Universite;

import java.util.Optional;

@Repository
public interface IUniversiteRepo extends JpaRepository<Universite,Long> {
    Optional<Universite> findByNomUniversite(String nomUniversite);
}
