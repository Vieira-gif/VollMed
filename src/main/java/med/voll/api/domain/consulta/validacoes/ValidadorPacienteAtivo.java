package med.voll.api.domain.consulta.validacoes;

import jakarta.validation.ValidationException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.paciente.PacienteRepository;

public class ValidadorPacienteAtivo {
    private PacienteRepository repository;
    public void validar(DadosAgendamentoConsulta dados){
        var pacienteAtivo = repository.findAtivoById(dados.idPaciente());
        if (!pacienteAtivo){
            throw new ValidationException("Consulta não pode ser marcada com um paciente inativo");
        }
    }
}
