package rescate.naturaleza.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import rescate.naturaleza.demo.enums.ReportEnum;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateReportRequestDTO {

    @NotNull
    private ReportEnum reportType;

    @NotNull
    private Double latitude;

    @NotNull
    private Double longitude;

    @NotBlank
    private String comuna;

    private String description;

}
