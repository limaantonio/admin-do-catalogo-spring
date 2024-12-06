package application;
import com.ac.admin.catalogo.application.UseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UseCaseTest {

    @Test
    public void testCreateUseCae() {
        Assertions.assertNotNull(new UseCase());
    }
}