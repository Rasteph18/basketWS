package Basket.rebond;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RebondService {
    
    private final RebondRepository rebondRepository;

    @Autowired
    public RebondService(RebondRepository rebondRepository) {
        this.rebondRepository = rebondRepository;
    }

    
}
