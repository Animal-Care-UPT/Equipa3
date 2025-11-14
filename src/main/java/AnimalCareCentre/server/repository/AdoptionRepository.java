
package AnimalCareCentre.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AnimalCareCentre.server.model.Adoption;

public interface AdoptionRepository extends JpaRepository<Adoption, Long> {}
