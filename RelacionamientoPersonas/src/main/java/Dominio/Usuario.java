package Dominio;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usu_id;

    private String usu_nombre;
    private String usu_contrasenia;

    public void crearUsuario(String usu_nombre, String usu_contrasenia) {
        this.usu_nombre = usu_nombre;
        this.usu_contrasenia = usu_contrasenia;
    }

    public boolean iniciarSesion(String nombreUsuario, String contrasenia){
            return usu_nombre.equals(nombreUsuario) && usu_contrasenia.equals(contrasenia);
    }

    public void logout(){

    }

    public Long getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(Long usu_id) {
        this.usu_id = usu_id;
    }

    public String getUsu_nombre() {
        return usu_nombre;
    }

    public void setUsu_nombre(String usu_nombre) {
        this.usu_nombre = usu_nombre;
    }

    public String getUsu_contrasenia() {
        return usu_contrasenia;
    }

    public void setUsu_contrasenia(String usu_contrasenia) {
        this.usu_contrasenia = usu_contrasenia;
    }
}
