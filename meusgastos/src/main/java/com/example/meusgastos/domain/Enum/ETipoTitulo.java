package com.example.meusgastos.domain.Enum;

public enum ETipoTitulo {
    ARECEBER("A RECEBER"),
    APAGAR("A PAGAR");

    private String valor;
    

    private ETipoTitulo(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
