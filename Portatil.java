public class Portatil {
    //
    private String usuario;
    //
    private int contraseña;
    //
    private boolean encendido;

    public Portatil (int numeroContraseña, String nombreUsuario) {
        contraseña = numeroContraseña;
        usuario = nombreUsuario;
        encendido = true;
    }

    /**
     * Devuelve la contraseña
     */
    public int getContraseña() {
        return contraseña;
    }

    /**
     * Devuelve el usuario 
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Devuelve el tipo de encendido
     */
    public boolean getEncencido() {
        return encendido;
    }

    /**
     * Cambio de usuario
     */
    public void setUsuario(String newUsuario) {
        usuario = newUsuario;
    }

    /**
     * Suma una cantidad para cambiar la contraseña
     */
    public void cambioCantraseña(int sumaParaCambiarContraseña) {
        contraseña = contraseña + sumaParaCambiarContraseña;
    } 

    /**
     * Apagar portatil
     */
    public void apagarPortatil() {
        encendido = false;
    }

    /**
     * Enseña los detalles actuales del portatil
     */
    public void imprimirDetalles() {
        if(encendido == true) {
            System.out.println("Ususario:" + usuario + " | Contraseña:" + contraseña + " | Encendido: Si");
        }
        else {
            System.out.println("Ususario:" + usuario + " | Contraseña:" + contraseña + "| Encendido: No");
        }
    }

    /**
     * Devuelve los detalles actuales
     */
    public String getDetalles(){
        String devolverDetalles;
        if(encendido == true) {
            devolverDetalles = "Ususario:" + usuario + " | Contraseña:" + contraseña + " | Encendido: Si";
        }
        else {
            devolverDetalles = "Ususario:" + usuario + " | Contraseña:" + contraseña + " | Encendido: No";
        }
        return devolverDetalles; 
    }
}