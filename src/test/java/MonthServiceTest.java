import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.MonthService;

public class MonthServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "Month.csv")

    public void shouldCalcMonth(int expected, int income, int expenses, int threshold) {
        MonthService service = new MonthService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
