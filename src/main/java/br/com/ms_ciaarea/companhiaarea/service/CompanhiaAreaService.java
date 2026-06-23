package br.com.ms_ciaarea.companhiaarea.service;

import br.com.ms_ciaarea.companhiaarea.dto.CompanhiaAereaDTO;
import br.com.ms_ciaarea.companhiaarea.exception.ResourceNotFoundException;
import br.com.ms_ciaarea.companhiaarea.model.CompanhiaAerea;
import br.com.ms_ciaarea.companhiaarea.repository.CompanhiaAereaRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanhiaAreaService {

    private final CompanhiaAereaRepository repository;


    public CompanhiaAreaService(CompanhiaAereaRepository repository) {
        this.repository = repository;
    }

    // RF07 - Cadastrar
    public CompanhiaAerea cadastrar(CompanhiaAereaDTO dto) {
        CompanhiaAerea companhia = new CompanhiaAerea();
        companhia.setNome(dto.nome());
        companhia.setCodigoIata(dto.codigoIata());
        companhia.setPais(dto.pais());

        return repository.save(companhia);
    }

    // RF08 - Editar
    public CompanhiaAerea atualizar(Long id, CompanhiaAereaDTO dto) {
        CompanhiaAerea companhia = buscarPorId(id);

        companhia.setNome(dto.nome());
        companhia.setCodigoIata(dto.codigoIata());
        companhia.setPais(dto.pais());

        return repository.save(companhia);
    }

    public CompanhiaAerea buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Companhia não encontrada"));
    }

    /*
    // RF10 - Listar voos da companhia
    public List<Voo> listarVoos(Long companhiaId) {
        buscarPorId(companhiaId); // valida existência
        //   return vooRepository.findByCompanhiaAereaId(companhiaId);
        return List.of();
    }

    // RF09 - Associar voo à companhia
    public Voo associarVoo(Long companhiaId, Long vooId) {
        CompanhiaAerea companhia = buscarPorId(companhiaId);

     */

       /*
    Voo voo = vooRepository.findById(vooId)
                .orElseThrow(() -> new ResourceNotFoundException("Voo não encontrado"));

        */

        //   voo.setCompanhiaAerea(companhia);

        ///    return vooRepository.save(voo);
      //  return null;
    //}

}
