package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.entity.Universite;

import java.util.List;
import java.util.Optional;

public interface IUniversiteInterface {
    List<Universite> retrieveAllUniversities();

    Universite addUniversite(Universite u);

    Universite updateUniversite(Universite u);
     Universite affecterFoyerAUniversite (long idFoyer, String
            nomUniversite);

    Optional<Universite> retrieveUniversite(long idUniversite);
}
