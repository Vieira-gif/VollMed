package med.voll.api.controller;

import med.voll.api.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("paciente")
public class PacienteController {
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPaciente dados){
        System.out.println("Dados recebidos :" + dados);
    }
}
