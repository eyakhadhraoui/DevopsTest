package tn.esprit.tpfoyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.IBlocRepo;
import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class IBlocService implements IBlocInterface {

    IBlocRepo br;
    @Override
    public List<Bloc> retrieveBlocs() {
        return br.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return br.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {

        return br.save(bloc);
    }

    @Override
    public Optional<Bloc> retrieveBloc(long idBloc) {
        return br.findById(idBloc);
    }

    @Override
    public void removeBloc(long idBloc) {
        br.deleteById(idBloc);
    }
}
