package Basket.joueurEquipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "joueurEquipe")
public class JoueurEquipeController {
    
    private final JoueurEquipeService joueurEquipeService;

    @Autowired
    public JoueurEquipeController(JoueurEquipeService joueurEquipeService) {
        this.joueurEquipeService = joueurEquipeService;
    }

    
}
