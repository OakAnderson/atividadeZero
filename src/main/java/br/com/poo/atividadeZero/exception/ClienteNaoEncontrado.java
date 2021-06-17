package br.com.poo.atividadeZero.exception;

public class ClienteNaoEncontrado extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ClienteNaoEncontrado(String exception) {
        super(exception);
    }
}
