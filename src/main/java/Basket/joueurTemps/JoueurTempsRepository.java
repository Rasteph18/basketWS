package Basket.joueurTemps;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoueurTempsRepository extends JpaRepository<JoueurTemps, Long> {
    
}
