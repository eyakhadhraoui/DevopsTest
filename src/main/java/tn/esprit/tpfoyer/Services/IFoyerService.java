package tn.esprit.tpfoyer.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.IFoyerRepo;
import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;
import java.util.Optional;

@Service
public class IFoyerService implements IFoyerInterface {
    @Autowired
    IFoyerRepo fr;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return fr.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return fr.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return fr.save(f);
    }

    @Override
    public Optional<Foyer> retrieveFoyer(long idFoyer) {
        return fr.findById(idFoyer);
    }

    @Override
    public void removeFoyer(long idFoyer) {
        fr.deleteById(idFoyer);

    }
}
