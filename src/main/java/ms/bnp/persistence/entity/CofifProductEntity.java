package ms.bnp.persistence.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "PRODUTO_COSIF")
@Table(name = "PRODUTO_COSIF", schema = "public")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CofifProductEntity {
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "cod_cosif")
    String cosifCode;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "cod_produto", nullable = false, referencedColumnName = "cod_produto")
    ProductEntity productCode;

    @Column(name = "cod_classificacao")
    String classificationCode;
    @Column(name = "sta_status")
    String status;
}
