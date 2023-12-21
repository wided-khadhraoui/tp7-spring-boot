package tp.securingweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tp.securingweb.Entity.RentalContract;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface RentalContractRepo extends JpaRepository<RentalContract,Long> {

}
