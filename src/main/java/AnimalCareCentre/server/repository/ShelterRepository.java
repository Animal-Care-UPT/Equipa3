package AnimalCareCentre.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AnimalCareCentre.server.model.Shelter;

public interface ShelterRepository extends JpaRepository<Shelter, Long> {}
