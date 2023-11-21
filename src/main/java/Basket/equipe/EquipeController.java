package Basket.equipe;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "equipe")
public class EquipeController {
    
    private final EquipeService equipeService;

    public EquipeController(EquipeService equipeService)
    {
        this.equipeService = equipeService;
    }

    @GetMapping
    public List<Equipe> getEquipes()
    {
        return equipeService.getEquipes();
    }

    @GetMapping("/{id}")
    public Equipe getEquipeById(@PathVariable("id") Long id)
    {
        return equipeService.getEquipeById(id);
    }
}
