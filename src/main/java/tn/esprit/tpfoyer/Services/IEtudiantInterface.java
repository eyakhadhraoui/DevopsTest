package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.List;
import java.util.Optional;

public interface IEtudiantInterface {
    List<Etudiant> retrieveAllEtudiants();
    List<Etudiant> addEtudiants (List<Etudiant> etudiants);
    Etudiant updateEtudiant (Etudiant e);
    Optional<Etudiant> retrieveEtudiant(long idEtudiant);
    void removeEtudiant(long idEtudiant);

}
