import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileTest {
    @Test
    void deveCriarArquivoJSON()
    {
        FileManager file = FileManager.getInstance();
        assertEquals("Arquivo JSON criado",file.create("JSON"));
    }

    @Test
    void deveLerArquivoJSON()
    {
        FileManager file = FileManager.getInstance();
        assertEquals("Leitor JSON criado",file.read("JSON"));
    }

    @Test
    void deveEscreverArquivoJSON()
    {
        FileManager file = FileManager.getInstance();
        assertEquals("Escritor JSON criado",file.write("JSON"));
    }

    @Test
    void deveRecusarCriarArquivoMP4()
    {
        FileManager file = FileManager.getInstance();
        try
        {
            String test = file.create("MP4");
            fail();
        }catch (IllegalArgumentException e) {
            assertEquals("Formato inexistente", e.getMessage());
        }
    }
}
