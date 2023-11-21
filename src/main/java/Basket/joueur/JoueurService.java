package Basket.joueur;

import org.springframework.stereotype.Service;

@Service
public class JoueurService {
    
    private final JoueurRepository joueurRepository;

    public JoueurService(JoueurRepository joueurRepository) {
        this.joueurRepository = joueurRepository;
    }

}
