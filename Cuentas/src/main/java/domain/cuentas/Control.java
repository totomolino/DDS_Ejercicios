package domain.cuentas;

import java.util.Arrays;
import java.util.List;

public class Control {


    //Cuentas
    Cuenta cuenta1 = new Cuenta(20100);
    Cuenta cuenta2 = new Cuenta(7);
    Cuenta cuenta3 = new Cuenta(10000);
    Cuenta cuenta4 = new Cuenta(2010);
    Cuenta cuenta5 = new Cuenta(201000);
    Cuenta cuenta6 = new Cuenta(100000);

    //Cliente
    List<Cuenta> listaCuentasFran = Arrays.asList(cuenta1,cuenta2);
    Cliente fran = new Cliente(42469901, listaCuentasFran);

    List<Cuenta> listaCuentasCami = Arrays.asList(cuenta3,cuenta4);
    Cliente cami = new Cliente(42469901, listaCuentasCami);

    List<Cuenta> listaCuentasCaro = Arrays.asList(cuenta5,cuenta6);
    Cliente caro = new Cliente(41150505, listaCuentasCaro);

    List<Cuenta> listaCuentasToto = Arrays.asList(cuenta2,cuenta6);
    Cliente toto = new Cliente(5, listaCuentasToto);


    List<Cliente> listaDeClientes = Arrays.asList(fran,caro,cami,toto);


    public Cliente encontrarCliente (int unDNI){
        Cliente unCliente = listaDeClientes.stream().filter(cliente -> cliente.getDni() == unDNI).findAny().orElse(null);
        return unCliente;
    }


    public int cuantasCuentasConSaldoMayor (int unDNI, int unSaldo) {
        Cliente unCliente = this.encontrarCliente(unDNI);
        if(unCliente != null){
            return unCliente.contarCuentas(unSaldo);
        }else{
            return -1;
        }
    }
}