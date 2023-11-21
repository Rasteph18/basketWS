package Basket.joueurFaute;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoueurFauteRepository extends JpaRepository<JoueurFaute, Long> {
    
}
