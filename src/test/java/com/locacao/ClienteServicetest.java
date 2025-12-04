package com.locacao;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.locacao.model.Cliente;
import com.locacao.repository.ClienteRepository;
import com.locacao.service.ClienteService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ClienteServiceTest {

    @Mock
    private ClienteRepository clienteRepository;

    @InjectMocks
    private ClienteService clienteService;

    @Test
    void deveCriarNovoClienteComSucesso() {

        // Arrange — criando cliente enviado pelo usuário (sem ID ainda)
        Cliente clienteEntrada = new Cliente();
        clienteEntrada.setNome("João Silva");
        clienteEntrada.setCpf("12345678900");
        clienteEntrada.setEndereco("Rua A, 123");
        clienteEntrada.setEmail("joao@gmail.com");
        clienteEntrada.setTelefone("11999999999");

        // Cliente retornado pelo banco (com ID gerado automaticamente)
        Cliente clienteSalvo = new Cliente();
        clienteSalvo.setIdCliente(1);
        clienteSalvo.setNome("João Silva");
        clienteSalvo.setCpf("12345678900");
        clienteSalvo.setEndereco("Rua A, 123");
        clienteSalvo.setEmail("joao@gmail.com");
        clienteSalvo.setTelefone("11999999999");

        // Mock do save()
        when(clienteRepository.save(clienteEntrada)).thenReturn(clienteSalvo);

        // Act — chamando o service
        Cliente resultado = clienteService.salvar(clienteEntrada);

        // Assert
        assertNotNull(resultado);
        assertEquals(1, resultado.getIdCliente());
        assertEquals("João Silva", resultado.getNome());
        assertEquals("12345678900", resultado.getCpf());
        assertEquals("Rua A, 123", resultado.getEndereco());
        assertEquals("joao@gmail.com", resultado.getEmail());
        assertEquals("11999999999", resultado.getTelefone());

        // Verifica se o repositório foi chamado corretamente
        verify(clienteRepository, times(1)).save(clienteEntrada);
    }
}