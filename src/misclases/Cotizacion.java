/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

/**
 *
 * @author _Windows_
 */
public class Cotizacion {

    private int numCotizacion;
    private String descripcion;
    private float precio;
    private float porPagoInicial;
    private int plazos;

    //Metodos
    //Metodos COnstructor
    public Cotizacion() { //COnstructor por omision
        this.numCotizacion = 0;
        this.descripcion = "";
        this.precio = 0.0f;
        this.porPagoInicial = 0.0f;
        this.plazos = 0;
    }

    public Cotizacion(int numCotizacion, String descripcion, float precio, float porPagoInicial, int plazos) { //Onstructor por asignacion
        this.numCotizacion = numCotizacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.porPagoInicial = porPagoInicial;
        this.plazos = plazos;
    }

    public Cotizacion(Cotizacion otro) { //Constructor por copia
        this.numCotizacion = otro.numCotizacion;
        this.descripcion = otro.descripcion;
        this.precio = otro.precio;
        this.porPagoInicial = otro.porPagoInicial;
        this.plazos = otro.plazos;
    }

    public int getNumCotizacion() {
        return numCotizacion;
    }

    public void setNumCotizacion(int numCotizacion) {
        this.numCotizacion = numCotizacion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public float getPorPagoInicial() {
        return porPagoInicial;
    }
    public void setPorPagoInicial(float porPagoInicial) {
        this.porPagoInicial = porPagoInicial;
    }
    public int getPlazos() {
        return plazos;
    }
    public void setPlazos(int plazos) {
        this.plazos = plazos;
    }
    
    //Metodos de comportamiento
    public float calcularPagoInicial() {
        return precio * (porPagoInicial / 100.0f);
    }

    public float calcularTotalFinanciar() {
        float pFinal;
        pFinal = this.precio - this.calcularPagoInicial();
        return pFinal;
    }

    public float calcularPagoMensual() 
    {
        float r;
        if (this.plazos != 0) {
            r=this.calcularTotalFinanciar() / this.plazos;
            return r;
        } else {
            System.out.println("Error: No se pueden calcular los pagos mensuales con 0 plazos.");
            return 0.0f;
        }
    }

    public void imprimirCotizacion() {
        
        System.out.println("Número de Cotización: " + this.getNumCotizacion());
        System.out.println("Descripción: " + this.getDescripcion());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Porcentaje de Pago Inicial: " + this.getPorPagoInicial());
        System.out.println("Plazo: " + this.getPlazos());
        System.out.println("Pago Inicial = " + this.calcularPagoInicial());
        System.out.println("Total a Financiar = " + this.calcularTotalFinanciar());
        System.out.println("Pago mensual = " + this.calcularPagoMensual() + "\n\n");
        
        System.out.println("Presiona Enter para continuar...");
        new java.util.Scanner(System.in).nextLine();

    }

}
