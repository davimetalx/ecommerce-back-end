package com.ecommerce.mapper;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO mapToDTO(Product product);

    Product mapToModel(ProductDTO productDTO);

}
