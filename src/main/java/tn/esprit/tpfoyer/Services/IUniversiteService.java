package tn.esprit.tpfoyer.Services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.IBlocRepo;
import tn.esprit.tpfoyer.Repository.IChamberRepo;
import tn.esprit.tpfoyer.Repository.IFoyerRepo;
import tn.esprit.tpfoyer.Repository.IUniversiteRepo;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.entity.Universite;


import java.util.List;
import java.util.Optional;

@Service
public class IUniversiteService implements IUniversiteInterface{
    @Autowired
    IUniversiteRepo ur;
    @Autowired
    IBlocRepo IBlocRepo;
    @Autowired
    IChamberRepo IChamberRepo;
    @Autowired
    IFoyerRepo IFoyerRepo;

    @Override
    public List<Universite> retrieveAllUniversities() {
        return ur.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return ur.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return ur.save(u);
    }

    @Override
    public Optional<Universite> retrieveUniversite(long idUniversite) {
        return ur.findById(idUniversite);
    }
    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {

        // Récupérer l'université par son nom
        Universite Universite = ur.findByNomUniversite(nomUniversite)
                .orElseThrow(() -> new RuntimeException("Université introuvable"));

        // Récupérer le foyer par son id
        Foyer foyer = IFoyerRepo.findById(idFoyer)
                .orElseThrow(() -> new RuntimeException("Foyer introuvable"));

        // Affecter le foyer à l'université
        Universite.setFoyer(foyer);

        // Sauvegarder et retourner
        return ur.save(Universite);
    }



}
