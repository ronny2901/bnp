package ms.bnp.persistence.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ms.bnp.api.dto.request.MovementRequest;
import ms.bnp.persistence.entity.ManualMovementEntity;
import ms.bnp.persistence.repository.MovementRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class MovementService {

    private final MovementRepository movimentoRepository;

    private final ModelMapper modelMapper;

    public String create(MovementRequest request) {

        var requestMapped = modelMapper.map(request, ManualMovementEntity.class);

        movimentoRepository.save(requestMapped);

        return "Funciona";
    }

    public List<ManualMovementEntity> findAll() {
        return (List<ManualMovementEntity>) movimentoRepository.findAll();
    }
}
