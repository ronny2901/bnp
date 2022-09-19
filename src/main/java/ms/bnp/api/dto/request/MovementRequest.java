package ms.bnp.api.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MovementRequest {

    Integer mes;
    Integer ano;
    String codCosif;
    String codProduto;
    BigDecimal valor;
    String descricao;

}
