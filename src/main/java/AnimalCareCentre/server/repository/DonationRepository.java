
package AnimalCareCentre.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AnimalCareCentre.server.model.Donation;

public interface DonationRepository extends JpaRepository<Donation, Long> {}
