package com.Proiect.ProiectFinal.models;

import javax.validation.constraints.NotBlank;

public class Test {

    @NotBlank
    private double tencuialaInterioara;
    @NotBlank
    private double tencuialaExterioara;
    @NotBlank
    private double zidarieDeCalcar;
    @NotBlank
    private double placiDeCheramzitobeton;
    @NotBlank
    private double pereteDinCaramidaPlina;
    @NotBlank
    private double pereteCaramidaCuGoluri;
    @NotBlank
    private double betonArmat;
    @NotBlank
    private double gazbeton;
    @NotBlank
    private double blocDeBeton;
    @NotBlank
    private double piatraBut;
    @NotBlank
    private double adeziv;

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @NotBlank
    private double result;

    public double getTencuialaInterioara() {
        return tencuialaInterioara;
    }

    public void setTencuialaInterioara(double tencuialaInterioara) {
        this.tencuialaInterioara = tencuialaInterioara;
    }

    public double getTencuialaExterioara() {
        return tencuialaExterioara;
    }

    public void setTencuialaExterioara(double tencuialaExterioara) {
        this.tencuialaExterioara = tencuialaExterioara;
    }

    public double getZidarieDeCalcar() {
        return zidarieDeCalcar;
    }

    public void setZidarieDeCalcar(double zidarieDeCalcar) {
        this.zidarieDeCalcar = zidarieDeCalcar;
    }

    public double getPlaciDeCheramzitobeton() {
        return placiDeCheramzitobeton;
    }

    public void setPlaciDeCheramzitobeton(double placiDeCheramzitobeton) {
        this.placiDeCheramzitobeton = placiDeCheramzitobeton;
    }

    public double getPereteDinCaramidaPlina() {
        return pereteDinCaramidaPlina;
    }

    public void setPereteDinCaramidaPlina(double pereteDinCaramidaPlina) {
        this.pereteDinCaramidaPlina = pereteDinCaramidaPlina;
    }

    public double getPereteCaramidaCuGoluri() {
        return pereteCaramidaCuGoluri;
    }

    public void setPereteCaramidaCuGoluri(double pereteCaramidaCuGoluri) {
        this.pereteCaramidaCuGoluri = pereteCaramidaCuGoluri;
    }

    public double getBetonArmat() {
        return betonArmat;
    }

    public void setBetonArmat(double betonArmat) {
        this.betonArmat = betonArmat;
    }

    public double getGazbeton() {
        return gazbeton;
    }

    public void setGazbeton(double gazbeton) {
        this.gazbeton = gazbeton;
    }

    public double getBlocDeBeton() {
        return blocDeBeton;
    }

    public void setBlocDeBeton(double blocDeBeton) {
        this.blocDeBeton = blocDeBeton;
    }

    public double getPiatraBut() {
        return piatraBut;
    }

    public void setPiatraBut(double piatraBut) {
        this.piatraBut = piatraBut;
    }

    public double getAdeziv() {
        return adeziv;
    }

    public void setAdeziv(double adeziv) {
        this.adeziv = adeziv;
    }

    @Override
    public String toString() {
        return "Test{" +
                "tencuialaInterioara=" + tencuialaInterioara +
                ", tencuialaExterioara=" + tencuialaExterioara +
                ", zidarieDeCalcar=" + zidarieDeCalcar +
                ", placiDeCheramzitobeton=" + placiDeCheramzitobeton +
                ", pereteDinCaramidaPlina=" + pereteDinCaramidaPlina +
                ", pereteCaramidaCuGoluri=" + pereteCaramidaCuGoluri +
                ", betonArmat=" + betonArmat +
                ", gazbeton=" + gazbeton +
                ", blocDeBeton=" + blocDeBeton +
                ", piatraBut=" + piatraBut +
                ", adeziv=" + adeziv +
                '}';
    }
}

