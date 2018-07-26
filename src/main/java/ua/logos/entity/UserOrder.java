package ua.logos.entity;


import javafx.scene.chart.PieChart;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user_order")
public class UserOrder extends BaseEntity{

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date createdAt;

    @Override
    public String toString() {
        return "UserOrder [createdAt=" + createdAt + ", getId()=" + getId() + "]";
    }


}
