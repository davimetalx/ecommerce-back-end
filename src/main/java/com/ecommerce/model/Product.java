package com.ecommerce.model;

import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Product {

    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;

}
