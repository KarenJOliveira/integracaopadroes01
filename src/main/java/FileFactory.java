public class FileFactory{
    public static AbstractFactory getFactory(String format)
    {
        Class classe = null;
        Object objeto = null;
        try
        {
            classe = Class.forName(format.toUpperCase()+"Factory");
            objeto = classe.newInstance();
        } catch (Exception ex)
        {
            throw new IllegalArgumentException("Formato inexistente");
        }
        if(!(objeto instanceof AbstractFactory))
        {
            throw new IllegalArgumentException("Formato inválido");
        }
        return (AbstractFactory) objeto;
    }
}
