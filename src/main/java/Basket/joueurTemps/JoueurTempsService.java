package Basket.joueurTemps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoueurTempsService {
    
    private final JoueurTempsRepository joueurTempsRepository;

    @Autowired
    public JoueurTempsService(JoueurTempsRepository joueurTempsRepository) {
        this.joueurTempsRepository = joueurTempsRepository;
    }
    
}
