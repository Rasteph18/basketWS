package Basket.tir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "tir")
public class TirController {
    
    private final TirService tirService;

    @Autowired
    public TirController(TirService tirService) {
        this.tirService = tirService;
    }

    
}
