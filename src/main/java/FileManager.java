public class FileManager {
    private FileManager() {}
    private static FileManager instance = new FileManager();
    public static FileManager getInstance()
    {
        return instance;
    }

    public String create(String format)
    {
        AbstractFactory factory = FileFactory.getFactory(format);
        String result = factory.createFile();
        return result;
    }

    public String read(String format)
    {
        AbstractFactory factory = FileFactory.getFactory(format);
        String result = factory.createReader();
        return result;
    }

    public String write(String format)
    {
        AbstractFactory factory = FileFactory.getFactory(format);
        String result = factory.createWriter();
        return result;
    }
}
