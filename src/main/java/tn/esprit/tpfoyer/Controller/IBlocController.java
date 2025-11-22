package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Services.IBlocInterface;
import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class IBlocController {


    @Autowired
    IBlocInterface iBlocInterface;

    @GetMapping("/retrieveBlocs")
    public List<Bloc> retrieveBlocs(){
        return iBlocInterface.retrieveBlocs();
    }
    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc){
        return iBlocInterface.addBloc(bloc);
    }
    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc b){
        return iBlocInterface.updateBloc(b);
    }
    @GetMapping("/retrieveBloc/{bloc-id}")
    public Optional<Bloc> retrieveBloc(@PathVariable("bloc-id") long idBloc){
        return iBlocInterface.retrieveBloc(idBloc);
    }
    @DeleteMapping("/removeBloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id")long idBloc){
        iBlocInterface.removeBloc(idBloc);
    }


}
