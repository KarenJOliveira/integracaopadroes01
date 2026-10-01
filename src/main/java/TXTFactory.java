public class TXTFactory implements AbstractFactory{
    @Override
    public String createFile() {
        return "Arquivo TXT criado";
    }

    @Override
    public String createReader() {
        return "Leitor TXT criado";
    }

    @Override
    public String createWriter() {
        return "Escritor TXT criado";
    }
}
