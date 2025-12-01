package AnimalCareCentre.server.dto;

import AnimalCareCentre.server.enums.SecurityQuestion;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class SecurityQuestionDTO {
  
  @NotBlank(message = "The email is mandatory")
  private String email;

  @NotNull(message = "Security Question is mandatory!")
  private SecurityQuestion securityQuestion;

  @NotBlank(message = "Security Answer is mandatory!")
  private String answer;
  
  public String getEmail(){
    return email;
  }

  public SecurityQuestion getSecurityQuestion(){
    return securityQuestion;
  }

  public String getAnswer(){
    return answer;
  }
}
