package br.com.poo.atividadeZero.model;

import com.opencsv.bean.CsvBindByName;

public class Cliente {

    @CsvBindByName
    private Long id;
    @CsvBindByName
    private String cpf;
    @CsvBindByName
    private char sexo;
    @CsvBindByName(column = "peso_inicial")
    private float pesoInicial;
    @CsvBindByName(column = "peso_atual")
    private float pesoAtual;
    @CsvBindByName
    private float altura;
    @CsvBindByName
    private float biceps;
    @CsvBindByName
    private float peito;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(float pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public float getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(float pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBiceps() {
        return biceps;
    }

    public void setBiceps(float biceps) {
        this.biceps = biceps;
    }

    public float getPeito() {
        return peito;
    }

    public void setPeito(float peito) {
        this.peito = peito;
    }
}
