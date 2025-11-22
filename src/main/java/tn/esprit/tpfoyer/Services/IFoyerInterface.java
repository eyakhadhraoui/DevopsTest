package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;
import java.util.Optional;

public interface IFoyerInterface  {
    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer (Foyer f);
    Foyer updateFoyer (Foyer f);
    Optional<Foyer> retrieveFoyer (long idFoyer);
    void removeFoyer (long idFoyer);

}
