package ec.com.pablorcruh.simplerest.app.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Pablo Cruz
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name ="items")
public class Item {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @PrePersist
    private void prePersist(){
        this.createAt = new Date();
    }

}
