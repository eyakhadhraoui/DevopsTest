package tn.esprit.tpfoyer.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.IChamberRepo;
import tn.esprit.tpfoyer.entity.Chambre;

import java.util.List;
import java.util.Optional;

@Service
public class IChamberService implements IChamberInterface {
    @Autowired
    IChamberRepo cr;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return cr.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return cr.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return cr.save(c);
    }

    @Override
    public Optional<Chambre> retrieveChambre(long idChambre) {
        return cr.findById(idChambre);
    }

    @Override
    public void removeChambre(Long chambreId) {
        cr.deleteById(chambreId);

    }
}
