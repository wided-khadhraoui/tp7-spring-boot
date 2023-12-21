package tp.securingweb.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tp.securingweb.Entity.Owner;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface OwnerRepo  extends JpaRepository<Owner, Long> {
}
