package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.entity.Reservation;

import java.util.List;
import java.util.Optional;

public interface IReservationInterface {
    List<Reservation> retrieveAllReservation();
    Reservation updateReservation (Reservation res);
    Optional<Reservation> retrieveReservation (Long idReservation);

}
