package inbox.inbox.portfolio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PortfolioRepository extends
    JpaRepository<Portfolio, Long> {

    @Query(value = "select * from portfolio where portfolio.range_val = ?1", nativeQuery = true)
    List<Portfolio> findByRangeAll(byte range);
}
