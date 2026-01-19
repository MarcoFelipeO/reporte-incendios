package rescate.naturaleza.demo.service;

import org.springframework.stereotype.Service;
import rescate.naturaleza.demo.dto.CreateReportRequestDTO;
import rescate.naturaleza.demo.entity.Report;
import rescate.naturaleza.demo.enums.ReportStatusEnum;
import rescate.naturaleza.demo.repository.ReportRepository;

import java.util.Date;

@Service
public class ReportService {

    private final ReportRepository repository;

    public ReportService(ReportRepository repository) {
        this.repository = repository;
    }

    public void createRepository(CreateReportRequestDTO  request){

        Report report = Report.builder()
                .reportType(request.getReportType())
                .latitude(request.getLatitude())
                .longitude(request.getLongitude())
                .comuna(request.getComuna())
                .description(request.getDescription())
                .createdAt(new Date())
                .status(ReportStatusEnum.ACTIVO)
                .build();

        repository.save(report);

    }
}
