package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;
import java.util.Optional;

public interface IBlocInterface  {

    List<Bloc> retrieveBlocs();
    Bloc updateBloc (Bloc bloc);
    Bloc addBloc (Bloc bloc);
    Optional<Bloc> retrieveBloc (long idBloc);
    void removeBloc (long idBloc);

}
