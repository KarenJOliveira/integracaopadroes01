public class XMLFactory implements AbstractFactory{
    @Override
    public String createFile() {
        return "Arquivo XML criado";
    }

    @Override
    public String createReader() {
        return "Leitor XML criado";
    }

    @Override
    public String createWriter() {
        return "Escritor XML criado";
    }
}
