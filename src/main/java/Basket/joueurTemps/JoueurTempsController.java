package Basket.joueurTemps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "joueurTemps")
public class JoueurTempsController {
    
    private final JoueurTempsService joueurTempsService;

    @Autowired
    public JoueurTempsController(JoueurTempsService joueurTempsService) {
        this.joueurTempsService = joueurTempsService;
    }

    
}
