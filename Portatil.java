public class Portatil {
    //
    private String usuario;
    //
    private int contrase�a;
    //
    private boolean encendido;

    public Portatil (int numeroContrase�a, String nombreUsuario) {
        contrase�a = numeroContrase�a;
        usuario = nombreUsuario;
        encendido = true;
    }

    /**
     * Devuelve la contrase�a
     */
    public int getContrase�a() {
        return contrase�a;
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
     * Suma una cantidad para cambiar la contrase�a
     */
    public void cambioCantrase�a(int sumaParaCambiarContrase�a) {
        contrase�a = contrase�a + sumaParaCambiarContrase�a;
    } 

    /**
     * Apagar portatil
     */
    public void apagarPortatil() {
        encendido = false;
    }

    /**
     * Ense�a los detalles actuales del portatil
     */
    public void imprimirDetalles() {
        if(encendido == true) {
            System.out.println("Ususario:" + usuario + " | Contrase�a:" + contrase�a + " | Encendido: Si");
        }
        else {
            System.out.println("Ususario:" + usuario + " | Contrase�a:" + contrase�a + "| Encendido: No");
        }
    }

    /**
     * Devuelve los detalles actuales
     */
    public String getDetalles(){
        String devolverDetalles;
        if(encendido == true) {
            devolverDetalles = "Ususario:" + usuario + " | Contrase�a:" + contrase�a + " | Encendido: Si";
        }
        else {
            devolverDetalles = "Ususario:" + usuario + " | Contrase�a:" + contrase�a + " | Encendido: No";
        }
        return devolverDetalles; 
    }
}