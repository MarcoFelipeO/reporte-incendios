package rescate.naturaleza.demo.dto;

import lombok.*;
import rescate.naturaleza.demo.enums.ReportEnum;
import rescate.naturaleza.demo.enums.ReportStatusEnum;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReportsResponseDTO {

    private Long id;
    private ReportEnum reportType;
    private Double latitude;
    private Double longitude;
    private String comuna;
    private String description;
    private ReportStatusEnum status;
    private Date createdAt;

}
