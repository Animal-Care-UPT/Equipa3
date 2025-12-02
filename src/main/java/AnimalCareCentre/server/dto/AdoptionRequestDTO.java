package AnimalCareCentre.server.dto;

import AnimalCareCentre.server.enums.AdoptionType;
import AnimalCareCentre.server.model.ShelterAnimal;
import AnimalCareCentre.server.model.User;
import jakarta.validation.constraints.NotNull;

public class AdoptionRequestDTO {

    @NotNull(message = "You must declare the id of the animal")
    private ShelterAnimal animalId;

    @NotNull(message = "You must declare if you are adopting or fostering")
    private AdoptionType adoptionType;

    private User userName;

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }

    public ShelterAnimal getAnimalId() {
        return animalId;
    }

    public void setAnimalId(ShelterAnimal animalId) {
        this.animalId = animalId;
    }

    public AdoptionType getAdoptionType() {
        return adoptionType;
    }

    public void setAdoptionType(AdoptionType adoptionType) {
        this.adoptionType = adoptionType;
    }
}
