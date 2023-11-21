package Basket.rebond;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rebond")
public class RebondController {
    
    private final RebondService rebondService;

    @Autowired
    public RebondController(RebondService rebondService) {
        this.rebondService = rebondService;
    }

    
}
