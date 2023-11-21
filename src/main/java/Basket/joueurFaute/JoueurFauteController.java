package Basket.joueurFaute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "joueurFaute")
public class JoueurFauteController {
    
    private final JoueurFauteService joueurFauteService;

    @Autowired
    public JoueurFauteController(JoueurFauteService joueurFauteService) {
        this.joueurFauteService = joueurFauteService;
    }

    
}
