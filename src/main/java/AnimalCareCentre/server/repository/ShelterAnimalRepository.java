package AnimalCareCentre.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AnimalCareCentre.server.model.ShelterAnimal;

public interface ShelterAnimalRepository extends JpaRepository<ShelterAnimal, Long> {}
