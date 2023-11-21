package Basket.joueurEquipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoueurEquipeService {
    
    private final JoueurEquipeRepository joueurEquipeRepository;

    @Autowired
    public JoueurEquipeService(JoueurEquipeRepository joueurEquipeRepository) {
        this.joueurEquipeRepository = joueurEquipeRepository;
    }
    
}
