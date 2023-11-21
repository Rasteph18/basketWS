package Basket.tir;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TirRepository extends JpaRepository<Tir, Long> {
    
}
