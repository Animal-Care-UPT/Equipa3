package AnimalCareCentre.server.controller;

import AnimalCareCentre.server.model.ShelterAnimal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AnimalCareCentre.server.service.ShelterAnimalService;

@RestController
@RequestMapping("/shelteranimals")
public class ShelterAnimalController {

  private final ShelterAnimalService shelterAnimalService;

  public ShelterAnimalController(ShelterAnimalService shelterAnimalService) {
    this.shelterAnimalService = shelterAnimalService;
  }

  @PostMapping
    public ShelterAnimal registerAnimal(@RequestBody ShelterAnimal shelterAnimal) {
      return shelterAnimalService.registerShelterAnimal(shelterAnimal);
  }

}
