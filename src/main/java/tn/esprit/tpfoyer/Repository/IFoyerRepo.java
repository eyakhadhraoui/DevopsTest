package tn.esprit.tpfoyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entity.Foyer;
@Repository
public interface IFoyerRepo extends JpaRepository<Foyer,Long> {
}
