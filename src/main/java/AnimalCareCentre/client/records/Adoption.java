package AnimalCareCentre.client.records;

import java.time.LocalDate;
import AnimalCareCentre.client.enums.*;

public record Adoption(
    Shelter shelter,
    ShelterAnimal animal,
    User user,
    AdoptionType adoptionType,
    Long adoptionId,
    Status status,
    LocalDate adoptionDate,
    LocalDate requestDate) {}
