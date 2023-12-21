package tp.securingweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tp.securingweb.Entity.Property;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface PropertyRepo extends JpaRepository<Property, Long> {
}
