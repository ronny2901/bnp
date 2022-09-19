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
@Entity(name = "PRODUTO")
@Table(name = "PRODUTO", schema = "public")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductEntity {

    @Id
    @GeneratedValue(strategy =AUTO)
    @Column(name = "cod_produto")
    String productCode;
    @Column(name = "des_produto")
    String productDescription;
    @Column(name = "sta_status")
    String status;
}
