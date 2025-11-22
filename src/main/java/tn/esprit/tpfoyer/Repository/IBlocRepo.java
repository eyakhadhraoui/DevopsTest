package tn.esprit.tpfoyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entity.Bloc;
@Repository
public interface IBlocRepo extends JpaRepository<Bloc,Long> {
}
