package br.com.poo.atividadeZero;

import br.com.poo.atividadeZero.model.Cliente;
import br.com.poo.atividadeZero.services.ClienteService;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class AcademiaMain {

    public static void main(String[] args) throws FileNotFoundException {
        ClienteService clienteService = new ClienteService();

        System.out.println("Média de peso da Academia: " + clienteService.mediaPeso());

        Cliente clienteQueMaisPerdeuPeso = clienteService.clienteQueMaisPerdeuPeso();

        System.out.printf("Cliente que mais perdeu peso: \n\nID: #%d\nCPF: %s\nPeso perdido: %.2fkg",
                clienteQueMaisPerdeuPeso.getId(),
                clienteService.formatCPF(clienteQueMaisPerdeuPeso),
                clienteService.perdaDePeso(clienteQueMaisPerdeuPeso));
    }
}
