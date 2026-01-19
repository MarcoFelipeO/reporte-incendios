package rescate.naturaleza.demo.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rescate.naturaleza.demo.dto.CreateReportRequestDTO;
import rescate.naturaleza.demo.service.ReportService;

@RestController
@RequestMapping(value="/reports")
@RequiredArgsConstructor
public class ReportController {

    private final ReportService service;

    public ReportController(ReportService service){

        this.service = service;
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Void> createReport(
            @Valid @RequestBody CreateReportRequestDTO request) {

        service.createRepository(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }
}

