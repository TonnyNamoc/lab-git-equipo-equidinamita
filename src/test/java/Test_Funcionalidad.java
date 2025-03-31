import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Test_Funcionalidad {

    public static String saludar(String nombre) {
        return "Hola, " + nombre + "!";
    }

    @Test
    public void testSaludar() {
        assertEquals("Hola, Ana!", saludar("Ana"));
    }
}
