package com.locacao;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.locacao.model.Imovel;
import com.locacao.repository.ClienteRepository;
import com.locacao.repository.ImovelRepository;
import com.locacao.service.ClienteService;
import com.locacao.service.ImovelService;

public class Imovelservicetest {

    @Mock
    private ImovelRepository imovelRepository;

    @InjectMocks
    private ImovelService imovelService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testBuscarPorIdRetornoCorreto() {

        // Arrange
        Integer id = 1;

        Imovel imovel = new Imovel();
        imovel.setId_imovel(id);
        imovel.setEndereco("Rua A");
        imovel.setTipo("Casa");
        imovel.setDescricao("Casa para alugar");
        imovel.setDisponivel(true);

        when(imovelRepository.findById(id))
                .thenReturn(Optional.of(imovel));

        // Act
        Imovel resultado = imovelService.buscarPorId(id);

        // Assert
        assertNotNull(resultado);
        assertEquals(id, resultado.getIdImovel());
        assertEquals("Casa para alugar", resultado.getDescricao());
        assertTrue(resultado.getDisponivel());

        verify(imovelRepository, times(1)).findById(id);
    }
    @Test
void testBuscarPorIdInexistenteDeveLancarExcecao() {
    // Arrange
    Integer id = 999;

    when(imovelRepository.findById(id))
            .thenReturn(Optional.empty()); // O repositório não encontrou nada

    // Act + Assert
    Imovel resultado = imovelService.buscarPorId(id);
    assertEquals(null, resultado
    );

    // Verifica se o repository foi chamado uma vez
    verify(imovelRepository, times(1)).findById(id);
}
@ExtendWith(MockitoExtension.class)
class ClienteServiceTest {

    @Mock
    private ClienteRepository clienteRepository;

    @InjectMocks
    private ClienteService clienteService;

    @Test
    void deveLancarExcecao_QuandoBuscarPorIdInexistente() {
        // Arrange
        Integer idInexistente = 999;

        Mockito.when(clienteRepository.findById(idInexistente))
               .thenReturn(Optional.empty());

        // Act + Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            clienteService.buscarPorId(idInexistente);
        }
    );

        assertEquals("Imóvel com ID 999 não encontrado.", exception.getMessage());

        Mockito.verify(clienteRepository).findById(idInexistente);
    }
}
}




