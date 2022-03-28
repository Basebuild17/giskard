package ai.giskard.repository.ml;

import ai.giskard.domain.ml.testing.TestExecution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestExecutionRepository extends JpaRepository<TestExecution, Long> {
    public List<TestExecution> findAllByTestId(long testId);
}
