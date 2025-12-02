package AnimalCareCentre.server.service;

import java.time.LocalDate;
import java.util.*;
import org.springframework.stereotype.Service;

import AnimalCareCentre.server.repository.SponsorshipRepository;
import AnimalCareCentre.server.dto.SponsorshipDTO;
import AnimalCareCentre.server.model.*;

@Service
public class SponsorshipService {

  private final SponsorshipRepository sponsorshipRepository;

  public SponsorshipService(SponsorshipRepository sponsorshipRepository) {
    this.sponsorshipRepository = sponsorshipRepository;
  }

  public Sponsorship createSponsorShip(User user, ShelterAnimal animal, Float amount) {
    Sponsorship sponsorship = new Sponsorship();
    sponsorship.setUser(user);
    sponsorship.setAnimal(animal);
    sponsorship.setAmount(amount);
    sponsorship.setStartDate(LocalDate.now());
    return sponsorshipRepository.save(sponsorship);
  }

  public List<Sponsorship> searchAll(){
    return sponsorshipRepository.findAll(); 
  }
  
  public List<SponsorshipDTO> searchSponsorshipsUser(User user){
    List <Sponsorship> sponsors = sponsorshipRepository.findByUser(user);
    return sponsors.stream().map(a -> {
      SponsorshipDTO dto = new SponsorshipDTO();
      dto.setUser(a.getUser());
      dto.setAnimal(a.getAnimal());
      dto.setAmount(a.getAmount());
      return dto;
    }).toList();
  } 
}
