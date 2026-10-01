public class JSONFactory implements AbstractFactory{
    @Override
    public String createFile() {
        return "Arquivo JSON criado";
    }

    @Override
    public String createReader() {
        return "Leitor JSON criado";
    }

    @Override
    public String createWriter() {
        return "Escritor JSON criado";
    }
}
