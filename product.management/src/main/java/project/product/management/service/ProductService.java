package project.product.management.service;

import java.util.List;
import project.product.management.dto.ProductRequestDto;
import project.product.management.dto.ProductResponseDto;
import project.product.management.entity.Product;

public interface ProductService {
    
    String addProduct(ProductRequestDto dto);
    String updateProduct(Product prod);
    String deleteProduct(Long prodId);
    
    // Updated return types using ProductResponseDto
    ProductResponseDto viewProduct(Long prodId);
    List<ProductResponseDto> viewAllProduct();
}