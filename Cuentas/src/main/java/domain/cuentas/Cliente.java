package domain.cuentas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cliente {

    public int dni;
    List<Cuenta> misCuentas = new ArrayList<>();


    public int contarCuentas(int unSaldo){
        List<Cuenta> cuentasFiltradas;
        cuentasFiltradas = misCuentas.stream().filter(cuenta -> cuenta.getSaldo() > unSaldo).collect(Collectors.toList());
        return cuentasFiltradas.size();
    }

    public int getDni(){
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setMisCuentas(List<Cuenta> misCuentas) {
        this.misCuentas = misCuentas;
    }

    public Cliente(int unDNI, List<Cuenta> misCuentas ) {
        this.setDni(unDNI);
        this.setMisCuentas(misCuentas);
    }



}
