package uk.ac.sheffield.paginationdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="The name of a product cannot be blank.")
    private String name;

    @Positive(message="Cannot have a negative price.")
    private Double price;

    public Long getId() {
        return id;
    }

    public @NotBlank(message = "The name of a product cannot be blank.") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "The name of a product cannot be blank.") String name) {
        this.name = name;
    }

    public @Positive(message = "Cannot have a negative price.") Double getPrice() {
        return price;
    }

    public void setPrice(@Positive(message = "Cannot have a negative price.") Double price) {
        this.price = price;
    }
}
