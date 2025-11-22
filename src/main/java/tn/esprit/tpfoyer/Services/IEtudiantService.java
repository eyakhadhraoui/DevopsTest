package tn.esprit.tpfoyer.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.IEtudiantRepo;
import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.List;
import java.util.Optional;

@Service
public class IEtudiantService implements IEtudiantInterface{
    @Autowired
    IEtudiantRepo er;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return er.findAll();
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return er.saveAll(etudiants);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return er.save(e);
    }

    @Override
    public Optional<Etudiant> retrieveEtudiant(long idEtudiant) {
        return er.findById(idEtudiant);
    }

    @Override
    public void removeEtudiant(long idEtudiant) {
        er.deleteById(idEtudiant);
    }
}
