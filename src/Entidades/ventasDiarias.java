package Entidades;

import java.time.LocalDate;
import java.util.Date;

public class ventasDiarias {
    private LocalDate fecha;
    private double ingCafe;
    private double ingInje;
    private double ingPani;
    private double ingProd;
    private double egcafe;
    private double egInje;
    private double egPani;
    private double egcasa;

    public ventasDiarias(LocalDate fecha, double ingCafe, double ingInje, double ingPani, double ingProd, double egcafe, double egInje, double egPani, double egcasa) {
        this.fecha = fecha;
        this.ingCafe = ingCafe;
        this.ingInje = ingInje;
        this.ingPani = ingPani;
        this.ingProd = ingProd;
        this.egcafe = egcafe;
        this.egInje = egInje;
        this.egPani = egPani;
        this.egcasa = egcasa;
    }

    public ventasDiarias(){}
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getIngCafe() {
        return ingCafe;
    }

    public void setIngCafe(double ingCafe) {
        this.ingCafe = ingCafe;
    }

    public double getIngInje() {
        return ingInje;
    }

    public void setIngInje(double ingInje) {
        this.ingInje = ingInje;
    }

    public double getIngPani() {
        return ingPani;
    }

    public void setIngPani(double ingPani) {
        this.ingPani = ingPani;
    }

    public double getIngProd() {
        return ingProd;
    }

    public void setIngProd(double ingProd) {
        this.ingProd = ingProd;
    }

    public double getEgcafe() {
        return egcafe;
    }

    public void setEgcafe(double egcafe) {
        this.egcafe = egcafe;
    }

    public double getEgInje() {
        return egInje;
    }

    public void setEgInje(double egInje) {
        this.egInje = egInje;
    }

    public double getEgPani() {
        return egPani;
    }

    public void setEgPani(double egPani) {
        this.egPani = egPani;
    }

    public double getEgcasa() {
        return egcasa;
    }

    public void setEgcasa(double egcasa) {
        this.egcasa = egcasa;
    }

    
}
