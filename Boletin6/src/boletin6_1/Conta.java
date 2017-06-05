/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1;

/**
 *
 * @author alvar
 */
public class Conta {
    private String nombre;
    private String numerocuenta;
    private double saldo;

    public Conta() {
    }

    public Conta(String nome, String numCont, double saldo) {
        this.nombre = nombre;
        this.numerocuenta = numerocuenta;
        this.saldo = saldo;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nome) {
        this.nombre = nome;
    }

    public String getnumerocuenta() {
        return numerocuenta;
    }

    public void setNumCont(String numCont) {
        this.numerocuenta = numerocuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean ingreso(double x){
        boolean ingreso=false;
            if(x>0){
                this.saldo=this.saldo+x;
                ingreso=true;
            }
        return ingreso;
    }
     public boolean reintegro(double x){
        boolean ingreso=false;
            if(x>0&&this.saldo>x){
                this.saldo=this.saldo-x;
                ingreso=true;
            }
        return ingreso;
    }

    
    public String visualizar() {
        return "Conta{" + "nombre=" + nombre + ", numerocuenta=" + numerocuenta + ", saldo=" + saldo + '}';
    }
    public void transferencia(Conta cont1,double y){
            if(this.getSaldo()>y){
                 this.reintegro(y);
                 cont1.ingreso(y);
                }
    } 
}