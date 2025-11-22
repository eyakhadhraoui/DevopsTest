package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Services.IReservationInterface;
import tn.esprit.tpfoyer.entity.Reservation;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class IReservationController {

    @Autowired
    IReservationInterface iReservationInterface;



    @GetMapping("/retrieveAllReservation")
    public List<Reservation> retrieveAllReservation(){
        return iReservationInterface.retrieveAllReservation();
    }
    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation reservation){
        return iReservationInterface.updateReservation(reservation);
    }
    @GetMapping("/retrieveReservation/{id-res}")
    public Optional<Reservation> retrieveReservation(@PathVariable("id-res") Long idRes){
        return iReservationInterface.retrieveReservation(idRes);
    }

}
