package ms.bnp.persistence.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movimento_manual")
@Entity(name = "movimento_manual")
@IdClass(MovementId.class)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ManualMovementEntity {

    @Id
    @Column(name = "dat_mes")
    private Integer month;

    @Id
    @Column(name = "dat_ano")
    private Integer year;

    @Id
    @Column(name = "num_lancamento")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer release;

    @Id
    @Column(name = "cod_produto")
    private String productCode;

    @Id
    @Column(name = "cod_cosif")
    private String cosifCode;

    @Column(name = "des_descricao")
    private String description;
}
