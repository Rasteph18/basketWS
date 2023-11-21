package Basket.passe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "passe")
public class PasseController {
    
    private final PasseService passeService;

    @Autowired
    public PasseController(PasseService passeService) {
        this.passeService = passeService;
    }


}
