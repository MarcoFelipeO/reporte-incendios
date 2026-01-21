package rescate.naturaleza.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rescate.naturaleza.demo.entity.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {

}
