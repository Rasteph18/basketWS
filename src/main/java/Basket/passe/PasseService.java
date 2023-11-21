package Basket.passe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasseService {
    
    private final PasseRepository passeRepository;

    @Autowired
    public PasseService(PasseRepository passeRepository) {
        this.passeRepository = passeRepository;
    }

    
}
