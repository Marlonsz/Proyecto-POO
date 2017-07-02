package Cliente_Vendedor;

/**
 * Created by piero512 on 12/6/17.
 */
public abstract class Usuario {
    //atributos de usuario
    protected String nombre;
    protected String apellidos;
    protected String numid;
    protected String tel;

    //constructor de usuario
    public Usuario(String nombre,String apellidos, String numid, String tel) {
        this.nombre = nombre;
        this.numid = numid;
        this.tel = tel;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumid() {
        return numid;
    }

    public void setNumid(String numid) {
        this.numid = numid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * Función que retorna una representación en
     * String del Objeto: Muestra los atributos no comunes.
     * @return String con datos del objeto.
     */
    @Override
    public String toString() {
        return String.format("Nombre: %s %s%n", this.nombre, this.apellidos) +
                String.format("Número de identificación : %s%n", this.numid) +
                String.format("Teléfono: %s%n", this.tel);
    }
}
