package Basket.equipe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipeService {
    
    private final EquipeRepository equipeRepository;

    @Autowired
    public EquipeService(EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }

    public List<Equipe> getEquipes() {
        return equipeRepository.findAll();
    }

    public Equipe getEquipeById(Long idEquipe) {
        return equipeRepository.getEquipeById(idEquipe);
    }
}
