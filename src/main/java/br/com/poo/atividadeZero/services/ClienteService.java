package br.com.poo.atividadeZero.services;

import br.com.poo.atividadeZero.exception.ClienteNaoEncontrado;
import br.com.poo.atividadeZero.model.Cliente;
import br.com.poo.atividadeZero.repository.ClientesRepository;

import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;

public class ClienteService {

    public ClienteService() {
    }

    public Cliente findById(Long id) throws FileNotFoundException {
        return ClientesRepository.findById(id)
                .orElseThrow(
                        () -> new ClienteNaoEncontrado("O cliente com o id " + id + " não foi encontrado.")
                );
    }

    public String formatCPF(Cliente cliente) {
        String cpf = cliente.getCpf();
        return cpf.substring(0,3) + "." + cpf.substring(3,6) + "." +  cpf.substring(6,9) + "-" + cpf.substring(9, 11);
    }

    public float mediaPeso() throws FileNotFoundException {
        List<Cliente> clienteList = ClientesRepository.findAll().get();
        return clienteList.stream()
                .reduce(0f, (t, c) -> t + c.getPesoAtual(), Float::sum) / clienteList.size();
    }

    public Cliente clienteQueMaisPerdeuPeso() throws FileNotFoundException {
        return ClientesRepository.findAll().get().stream()
                .max(Comparator.comparing(this::perdaDePeso)).get();
    }

    public float perdaDePeso( Cliente cliente ) {
        return cliente.getPesoInicial() - cliente.getPesoAtual();
    }
}
