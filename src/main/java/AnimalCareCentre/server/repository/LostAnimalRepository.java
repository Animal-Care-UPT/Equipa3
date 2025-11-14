
package AnimalCareCentre.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AnimalCareCentre.server.model.LostAnimal;

public interface LostAnimalRepository extends JpaRepository<LostAnimal, Long> {}
