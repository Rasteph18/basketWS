package Basket.tir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TirService {
    
    private final TirRepository tirRepository;

    @Autowired
    public TirService(TirRepository tirRepository) {
        this.tirRepository = tirRepository;
    }

    
}
