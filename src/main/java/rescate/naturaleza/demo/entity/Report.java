package rescate.naturaleza.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table(name="REPORT")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Report {

    @Id
    @Column(name="ID_REPORT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name="REPORT_TYPE")
    private  ReportEnum report;

    @Column(name="LONGITUDE")
    private Double longitude;

    @Column(name="COMUNA")
    private String comuna;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="CREATED_AT")
    private Date createdAt;

    @Enumerated(EnumType.STRING)
    @Column(name="REPORT_STATUS")
    private ReportStatusEnum status;

}
