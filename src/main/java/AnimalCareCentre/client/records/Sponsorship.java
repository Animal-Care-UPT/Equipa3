package AnimalCareCentre.client.records;

import java.time.LocalDate;
import java.util.List;

public record Sponsorship(long id, User user, ShelterAnimal animal, LocalDate startDate,
    Float amount, List<Donation> donations) {

  @Override
  public final String toString() {
    return "\nUser: " + user.name() + "\nAmount: " + amount + "\nStart Date: " + startDate + "\nAnimal:" + animal;
  }
}
