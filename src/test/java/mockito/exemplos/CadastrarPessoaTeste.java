package mockito.exemplos;

import com.example.mockito.ApiDosCorreios;
import com.example.mockito.CadastrarPessoa;
import com.example.mockito.DadosLocalizacao;
import com.example.mockito.Pessoa;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {


    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("CE", "Fortaleza", "Rua Goianeza", "casa", "Gernibau");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("123456")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Kassio", "123456", LocalDate.now(), "60534110");

        assertEquals("Kassio", pessoa.getNome());
    }

}
