package AnimalCareCentre.server.dto;

import AnimalCareCentre.server.enums.AdoptionType;
import AnimalCareCentre.server.enums.Status;
import java.time.LocalDate;

public class AdoptionResponseDTO {
    private Long shelterId;
    private Long animalId;
    private String animalName;
    private Long userId;
    private AdoptionType adoptionType;
    private Status status;
    private LocalDate requestDate;

    // Getters e Setters
    public Long getShelterId() { return shelterId; }
    public void setShelterId(Long shelterId) { this.shelterId = shelterId; }

    public Long getAnimalId() { return animalId; }
    public void setAnimalId(Long animalId) { this.animalId = animalId; }

    public String getAnimalName() { return animalName; }
    public void setAnimalName(String animalName) { this.animalName = animalName; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public AdoptionType getAdoptionType() { return adoptionType; }
    public void setAdoptionType(AdoptionType adoptionType) {
        this.adoptionType = adoptionType;
    }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    public LocalDate getRequestDate() { return requestDate; }
    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }
}