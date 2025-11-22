package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.entity.Chambre;

import java.util.List;
import java.util.Optional;
public interface IChamberInterface {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre (Chambre c);
    Optional<Chambre> retrieveChambre (long idChambre);
    public void removeChambre(Long chambreId);

}
