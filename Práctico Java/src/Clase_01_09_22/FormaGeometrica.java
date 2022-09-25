package Clase_01_09_22;

class Main{
    public static void main(String args[]){

    }
}
public abstract class FormaGeometrica {
    private String color = "Rojo";
    private boolean estaLleno = true;

    public void FormaGeometrica(){}
    public void FormaGeometrica(String color, boolean estaLleno){
        this.color = color;
        this.estaLleno =  estaLleno;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isEstaLleno() {
        return estaLleno;
    }
    public void setEstaLleno(boolean estaLleno) {
        this.estaLleno = estaLleno;
    }
    abstract double getArea();
    abstract double getPerimetro();
}
class Rectangulo extends FormaGeometrica {
    private double ancho;
    private double largo;

    public void Rectangulo(){}
    public void Rectangulo(double ancho, double largo){
        this.ancho = ancho;
        this.largo = largo;
    }
    public void Rectangulo(double ancho, double largo, String color, boolean estaLleno){
        this.ancho = ancho;
        this.largo = largo;
        this.setColor(color);
        this.setEstaLleno(estaLleno);
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double getLargo() {
        return largo;
    }
    public void setLargo(double largo) {
        this.largo = largo;
    }
    @Override
    double getArea(){
        return ancho * largo;
    }
    @Override
    double getPerimetro(){
        return  ancho * 2 + largo * 2;
    }
    @Override
    public String toString(){
        return "El ancho del rectangulo es de: " + this.ancho + ". El largo es de: " + this.largo
                + ". Su area es de: " + this.getArea() + " y su perimetro es de: " + this.getPerimetro() ;
    }
}

class Circulo extends FormaGeometrica {
    private double radio;

    public Circulo(){}
    public Circulo(double radio){
        this.radio = radio;
    }
    public Circulo(double radio, String color, boolean estaLleno){
        this.radio = radio;
        this.setColor(color);
        this.setEstaLleno(estaLleno);
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    double getArea() {
        return 2 * Math.PI * radio;
    }
    @Override
    double getPerimetro() {
        return  Math.PI * radio;
    }
    @Override
    public String toString(){
        return "El radio del circulo es de: " + this.radio + ". Su area es de: " + this.getArea() + " y su perimetro es de: " + this.getPerimetro() ;
    }
}

class Cuadrado extends Rectangulo {

    public Cuadrado(){}
    public Cuadrado(double lado){
        this.setAncho(lado);
        this.setLargo(lado);
    }
    public Cuadrado(double lado, String color, boolean estaLleno){
        this.setAncho(lado);
        this.setLargo(lado);
        this.setColor(color);
        this.setEstaLleno(estaLleno);
    }
    double getTamaño(double lado){
        return this.getAncho();
    }
    void setTamaño(double lado){
        this.setLargo(lado);
        this.setAncho(lado);
    }
    @Override
    public String toString(){
        return "El lado del cuadrado es de: " + this.getLargo() + ". Su area es de: " + this.getArea() + " y su perimetro es de: " + this.getPerimetro() ;
    }
}
