package br.com.poo.atividadeZero.repository;

import br.com.poo.atividadeZero.model.Cliente;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClientesRepository {

    public static Optional<List<Cliente>> findAll() throws FileNotFoundException {
        var clientes = new CsvToBeanBuilder<Cliente>(new FileReader(System.getenv("DATA_PATH")))
                .withType(Cliente.class).build().parse();

        return Optional.of(clientes);
    }

    public static Optional<Cliente> findById(Long id) throws FileNotFoundException {
        Cliente cliente = findAll().get().stream()
                .filter(c -> c.getId().equals(id))
                .collect(Collectors.toList()).get(0);
        return Optional.of(cliente);
    }

}
