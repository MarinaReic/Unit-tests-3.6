import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    SalesManager salesManager;
    long[] sales = {135, 92, 5, 22, 158};

    @BeforeEach
    public void beforeEach() {
        salesManager = new SalesManager(sales);
    }

    @Test
    public void maxTest() {
        long res = salesManager.max();
        Assertions.assertEquals(158, res);
    }

    @Test
    public void averageTest() {
        long res = salesManager.average();
        Assertions.assertEquals(83, res);
    }

    @Test
    public void averageByZeroTest() {
        this.sales = new long[]{5, 60};
        this.salesManager = new SalesManager(sales);
        Assertions.assertThrows(ArithmeticException.class, () -> salesManager.average());
    }
}
