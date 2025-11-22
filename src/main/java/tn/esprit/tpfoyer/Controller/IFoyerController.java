package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Services.IFoyerInterface;
import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class IFoyerController {

    IFoyerInterface iFoyerInterface;

    @GetMapping("/retrieveAllFoyers")
    public List<Foyer> retrieveAllFoyers(){
        return iFoyerInterface.retrieveAllFoyers();
    }
    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer foyer){
        return iFoyerInterface.addFoyer(foyer);
    }
    @PutMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer foyer){
        return iFoyerInterface.updateFoyer(foyer);
    }
    @GetMapping("/retrieveFoyer/{id-foyer}")
    public Optional<Foyer> retrieveFoyer(@PathVariable("id-foyer") long idFoyer){
        return iFoyerInterface.retrieveFoyer(idFoyer);
    }
    @DeleteMapping("/removeFoyer/{id-foyer}")
    public void removeFoyer(@PathVariable("id-foyer") long idFoyer){
        iFoyerInterface.removeFoyer(idFoyer);
    }


}
