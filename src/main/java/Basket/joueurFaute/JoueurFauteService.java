package Basket.joueurFaute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoueurFauteService {
    
    private final JoueurFauteRepository joueurFauteRepository;

    @Autowired
    public JoueurFauteService(JoueurFauteRepository joueurFauteRepository) {
        this.joueurFauteRepository = joueurFauteRepository;
    }

    
}
