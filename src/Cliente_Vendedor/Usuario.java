package Cliente_Vendedor;

/**
 * Created by piero512 on 12/6/17.
 */
public abstract class Usuario {
    protected String nombre;
    protected String apellidos;
    protected String numid;
    protected String tel;

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

    @Override
    public String toString() {
        return String.format("Nombre: %s %s%n", this.nombre, this.apellidos) +
                String.format("Número de identificación : %s", this.numid) +
                String.format("Teléfono: %s", this.tel);
    }
}
