package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Services.IChamberInterface;
import tn.esprit.tpfoyer.entity.Chambre;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/chamber")
public class IChamberController {
  @Autowired
  IChamberInterface chambreInterface;

    @GetMapping("/retrieve-list-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres= chambreInterface.retrieveAllChambres();
        return listChambres;
    }

    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Optional<Chambre> retrieveChambre(@PathVariable("chambre-id") Long chId) {
        Optional<Chambre> chambre= chambreInterface.retrieveChambre(chId);
        return chambre;
    }

    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre= chambreInterface.addChambre(c);
        return chambre;
    }

    @PutMapping("/update-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre= chambreInterface.updateChambre(c);
        return chambre;
    }

    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreInterface.removeChambre(chId);
    }


}
