package Basket.passe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasseRepository extends JpaRepository<Passe, Long> {
    
}
