import constants.ProcessType;
import orderprocessing.constants.ProcessType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import processor.ProcessImpl;

@RunWith(MockitoJUnitRunner.class)
public class ProcessImplTest {

    @InjectMocks
    ProcessImpl process;

    @Test
    public void doPaymentTestBook() {
        Double payAmount = 123.0;
        process.doPayment(ProcessType.BOOK, 123.0);
    }

    public void doPaymentTestProduct() {
        Double payAmount = 123.0;
        process.doPayment(ProcessType.PHYSICAL_PRODUCT, 123.0);
    }


}
