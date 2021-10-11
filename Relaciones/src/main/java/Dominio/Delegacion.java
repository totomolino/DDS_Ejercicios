package Dominio;

import Utils.BDUtils;

import javax.persistence.*;

@Entity
public class Delegacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deleg_id;

    @Enumerated(EnumType.STRING)
    private EstadoDelegacion deleg_estado;

    @OneToOne
    private Persona deleg_delegador;

     @OneToOne
     private Persona deleg_delegado;

     public static void crearDelegacion(EstadoDelegacion estado, Long delegador, Long delegado){
        Delegacion delegacion = new Delegacion();
        delegacion.deleg_estado = estado;
        delegacion.deleg_delegador = BDUtils.buscarPersona(delegador);
        delegacion.deleg_delegado = BDUtils.buscarPersona(delegado);

        BDUtils.agregarObjeto(delegacion);
     }



    public Long getDeleg_id() {
        return deleg_id;
    }

    public void setDeleg_id(Long deleg_id) {
        this.deleg_id = deleg_id;
    }

    public EstadoDelegacion getDeleg_estado() {
        return deleg_estado;
    }

    public void setDeleg_estado(EstadoDelegacion estado) {
        this.deleg_estado = estado;
    }

    public Persona getDeleg_delegador() {
        return deleg_delegador;
    }

    public void setDeleg_delegador(Persona deleg_delegador) {
        this.deleg_delegador = deleg_delegador;
    }

    public Persona getDeleg_delegado() {
        return deleg_delegado;
    }

    public void setDeleg_delegado(Persona deleg_delegado) {
        this.deleg_delegado = deleg_delegado;
    }
}
