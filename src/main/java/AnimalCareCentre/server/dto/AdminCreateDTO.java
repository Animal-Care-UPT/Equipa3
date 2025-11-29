package AnimalCareCentre.server.dto;


import AnimalCareCentre.server.enums.SecurityQuestion;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AdminCreateDTO {

  @NotBlank(message = "Name is mandatory!")
  private String name;
  @NotBlank(message = "Email is mandatory!")
  @Email(message = "Please enter a valid email address!")
  private String email;
  @NotBlank(message = "Password is mandatory!")
  private String password;
  @NotBlank(message = "Location is mandatory!")
  private String location;
  @NotNull(message = "Security Question is mandatory!")
  private SecurityQuestion securityQuestion;
  @NotBlank(message = "Security Answer is mandatory!")
  private String answer;
  @NotBlank(message = "Admin Secret is mandatory!")
  private String secret;

  public String getName() {
    return name;
  }
  public String getEmail() {
    return email;
  }
  public String getPassword() {
    return password;
  }
  public String getLocation() {
    return location;
  }
  public SecurityQuestion getSecurityQuestion() {
    return securityQuestion;
  }
  public String getAnswer() {
    return answer;
  }
  public String getSecret() {
    return secret;
  }
}
