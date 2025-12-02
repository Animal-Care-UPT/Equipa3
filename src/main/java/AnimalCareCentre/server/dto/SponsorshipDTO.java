package AnimalCareCentre.server.dto;

import jakarta.validation.constraints.NotNull;
import AnimalCareCentre.server.model.*;

public class SponsorshipDTO {

  private User user;
  @NotNull
  private ShelterAnimal animal;
  @NotNull
  private Float amount;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public ShelterAnimal getAnimal() {
    return animal;
  }

  public void setAnimal(ShelterAnimal animal) {
    this.animal = animal;
  }

  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

}
