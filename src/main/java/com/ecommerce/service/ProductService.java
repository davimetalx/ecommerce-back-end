package com.ecommerce.service;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.mapper.ProductMapper;
import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductMapper mapper;

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> getProducts() {
        return productRepository
                .findAll()
                .stream()
                .map(mapper::mapToDTO)
                .toList();
    }

    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = mapper.mapToModel(productDTO);
        productRepository.save(product);
        return mapper.mapToDTO(product);
    }

}
