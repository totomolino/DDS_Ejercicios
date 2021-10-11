package Utils;


import Dominio.Delegacion;
import Dominio.Persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class BDUtils {

    private static final EntityManagerFactory factory;

    static {
        factory = Persistence.createEntityManagerFactory("persistencia");
    }

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public static void comenzarTransaccion(EntityManager em) {
        EntityTransaction tx = em.getTransaction();
        if (!tx.isActive()) {
            tx.begin();
        }
    }

    public static void commit(EntityManager em) {
        EntityTransaction tx = em.getTransaction();
        if (tx.isActive()) {
            tx.commit();
        }
    }

    public static void rollback(EntityManager em) {
        EntityTransaction tx = em.getTransaction();
        if (tx.isActive()) {
            tx.rollback();
        }
    }

    public static void agregarObjeto(Object unObjeto) {
        EntityManager em = BDUtils.getEntityManager();
        BDUtils.comenzarTransaccion(em);

        em.persist(unObjeto);

        BDUtils.commit(em);
    }


    public static Persona buscarPersona(Long idPersona) {
        EntityManager em = BDUtils.getEntityManager();
        String hola = "from Persona where pers_id = '" + idPersona + "'";
        return (Persona) em.createQuery(hola).getResultList().get(0);
    }

    public static List<Delegacion> buscarLasQueDelegaronEnMi(String idPersona){
        EntityManager em = BDUtils.getEntityManager();
        String hola = "from Delegacion where deleg_delegado = '" + idPersona + "'";
        return em.createQuery(hola).getResultList();
    }

    public void aceptarUnaDelegacion(Long idDelegacion){
        EntityManager em = BDUtils.getEntityManager();
        em.createQuery("update Delegacion set deleg_estado = 'Aceptada' where deleg_id = '" + idDelegacion + "'");
    }

    public void revocarUnaDelegacion(Long idDelegacion){
        EntityManager em = BDUtils.getEntityManager();
        em.createQuery("update Delegacion set deleg_estado = 'Revocada' where deleg_id = '" + idDelegacion + "'");
    }

    public void borrarDelegacion(Long idDelegacion){
        EntityManager em = BDUtils.getEntityManager();
        em.createQuery("delete from Delegacion where deleg_id = '" + idDelegacion + "'");
    }

}