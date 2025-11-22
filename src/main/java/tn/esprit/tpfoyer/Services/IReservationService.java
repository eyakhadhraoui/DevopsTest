package tn.esprit.tpfoyer.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.IReservationRepo;
import tn.esprit.tpfoyer.entity.Reservation;

import java.util.List;
import java.util.Optional;

@Service
public class IReservationService implements IReservationInterface{
    @Autowired
    IReservationRepo rr;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return rr.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return null;
    }

    public Optional<Reservation> retrieveReservation(Long idReservation) {
        return rr.findById(idReservation);
    }
}
