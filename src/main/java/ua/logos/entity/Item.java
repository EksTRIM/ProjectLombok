package ua.logos.entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(
        callSuper = true,
        exclude = {"description","price","amount"})
@Table(name = "item")
public class Item extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column("description")
    private String description;

    @Column(name = "price", columnDefinition = "DECIMAL(6,2)")
    private BigDecimal price;

    @Column(name = "amount")
    private int amount;

    public Item(String name, String description, BigDecimal price, int amount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", description=" + description + ", price=" + price + ", amount=" + amount
                + ", getId()=" + getId() + "]";
    }

}
