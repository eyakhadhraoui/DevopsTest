package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Services.IEtudiantInterface;
import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class IEtudiantController {

    @Autowired
    IEtudiantInterface iEtudiantInterface;


    @GetMapping("/retrieveAllEtudiants")
    public List<Etudiant> retrieveAllEtudiants() {
        return iEtudiantInterface.retrieveAllEtudiants();
    }

    @PostMapping("/addEtudiants")
    public List<Etudiant> addEtudiants(@RequestBody List<Etudiant> etudiants) {
        return iEtudiantInterface.addEtudiants(etudiants);
    }

    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return iEtudiantInterface.updateEtudiant(etudiant);
    }

    @GetMapping("/retrieveEtudiant")
    public Optional<Etudiant> retrieveEtudiant(long idEtudiant) {
        return iEtudiantInterface.retrieveEtudiant(idEtudiant);
    }

    @DeleteMapping("/removeEtudiant/{id-etudiant}")
    public void removeEtudiant(@PathVariable("id-etudiant") long idEtudiant) {
        iEtudiantInterface.removeEtudiant(idEtudiant);
    }

}
