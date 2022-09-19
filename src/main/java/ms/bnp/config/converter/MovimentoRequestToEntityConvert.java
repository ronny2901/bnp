package ms.bnp.config.converter;

import ms.bnp.api.dto.request.MovementRequest;
import ms.bnp.persistence.entity.ManualMovementEntity;
import org.modelmapper.AbstractConverter;

public class MovimentoRequestToEntityConvert extends AbstractConverter<MovementRequest, ManualMovementEntity> {


    @Override
    protected ManualMovementEntity convert(MovementRequest request) {
        return ManualMovementEntity.builder()
                .cosifCode(request.getCodCosif())
                .description(request.getDescricao())
                .month(request.getMes())
                .year(request.getAno())
                .productCode(request.getCodProduto())
                .cosifCode(request.getCodCosif())
                .build();
    }
}
