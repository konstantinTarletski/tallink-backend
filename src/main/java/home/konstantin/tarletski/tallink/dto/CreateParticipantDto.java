package home.konstantin.tarletski.tallink.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateParticipantDto {

    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @NotNull
    private LocalDate birthDate;
}
