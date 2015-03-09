
/**
 * Generador de nombres segun el rumor de nombres de Star Wars
 * 
 * Nombre = 3 primeras letras apellido + 3 primeras letras nombre
 * Apellido = 2 primeras letras apellido madre + 3 primeras letras tu ciudad nacimiento
 * 
 * @author Sourdaci 
 * @version 2015-03-09 01
 */
public class NameGenerator
{
    private static final int TRES_LETRAS = 3;
    private static final int DOS_LETRAS = 2;
    private static final int INICIO = 0;

    /**
     * Inicializamos el generador vacio
     */
    public NameGenerator()
    {
    }

    /**
     * Generamos el nombre "Star Wars Style"
     * 
     * @param miNombre Tu nombre
     * @param miApellido Tu primer apellido
     * @param apellidoMadre El primer apellido de tu madre
     * @param ciudadNacimiento La localidad donde naciste
     * 
     * @return Tu nombre procesado segun el universo Star Wars
     */
    public String generateStarWarsName(String miNombre, String miApellido, String apellidoMadre, String ciudadNacimiento)
    {
        String nombreSW = miApellido.substring(INICIO, TRES_LETRAS) + miNombre.substring(INICIO, TRES_LETRAS);
        String apellidoSW = apellidoMadre.substring(INICIO, DOS_LETRAS) + ciudadNacimiento.substring(INICIO, TRES_LETRAS);
        return "La fuerza es poderosa en ti, " + nombreSW + " " + apellidoSW;
    }
}
