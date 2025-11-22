package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Services.IUniversiteInterface;
import tn.esprit.tpfoyer.entity.Universite;


import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class IUniversiteController {

    IUniversiteInterface iUniversiteInterface;
    IUniversiteInterface IUniversiteService;

    @GetMapping("/retrieveAllUniversities")
    public List<Universite> retrieveAllUniversities(){
        return iUniversiteInterface.retrieveAllUniversities();
    }
    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite universite){
        return iUniversiteInterface.addUniversite(universite);
    }
    @PutMapping("/updateUniversity")
    public Universite updateUniversity(@RequestBody Universite universite){
        return iUniversiteInterface.updateUniversite(universite);
    }
    @GetMapping("/retrieveUniversite/{id-uni}")
    public Optional<Universite> retrieveUniversite(@PathVariable("id-uni") long idUni){
        return iUniversiteInterface.retrieveUniversite(idUni);
    }
    @PutMapping("/affecterFoyerAUniversite/{idFoyer}/{nomUniversite}")
    public Universite affecterFoyerAUniversite(
            @PathVariable long idFoyer,
            @PathVariable String nomUniversite) {
        return IUniversiteService.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }


}
