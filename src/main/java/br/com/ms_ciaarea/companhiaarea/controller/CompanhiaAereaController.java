package br.com.ms_ciaarea.companhiaarea.controller;

import br.com.ms_ciaarea.companhiaarea.dto.CompanhiaAereaDTO;
import br.com.ms_ciaarea.companhiaarea.model.CompanhiaAerea;
import br.com.ms_ciaarea.companhiaarea.model.Voo;
import br.com.ms_ciaarea.companhiaarea.service.CompanhiaAreaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companhias")
public class CompanhiaAereaController {

    @Autowired
    private CompanhiaAreaService service;

    // RF07
    @PostMapping
    public CompanhiaAerea cadastrar(@RequestBody @Valid CompanhiaAereaDTO dto) {
        return service.cadastrar(dto);
    }

    // RF08
    @PutMapping("/{id}")
    public CompanhiaAerea atualizar(@PathVariable Long id,
                                    @RequestBody @Valid CompanhiaAereaDTO dto) {
        return service.atualizar(id, dto);
    }

    // RF09
    @PutMapping("/{companhiaId}/voos/{vooId}")
    public Voo associarVoo(@PathVariable Long companhiaId,
                           @PathVariable Long vooId) {
        return service.associarVoo(companhiaId, vooId);
    }

    // RF10
    @GetMapping("/{companhiaId}/voos")
    public List<Voo> listarVoos(@PathVariable Long companhiaId) {
        return service.listarVoos(companhiaId);
    }
}