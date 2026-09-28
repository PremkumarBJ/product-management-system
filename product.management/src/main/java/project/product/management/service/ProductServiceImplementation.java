package project.product.management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import project.product.management.dto.ProductRequestDto;
import project.product.management.dto.ProductResponseDto;
import project.product.management.entity.Product;
import project.product.management.repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService {

    private final ProductRepository repo;

    public ProductServiceImplementation(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public String addProduct(ProductRequestDto dto) {
        Product prod = new Product();
        prod.setName(dto.getName());
        prod.setDescription(dto.getDescription());
        prod.setPrice(dto.getPrice());
        prod.setPhotoUrl(dto.getPhotoUrl());

        repo.save(prod);
        return "Product added successfully";
    }

    @Override
    public String updateProduct(Product prod) {
        repo.save(prod);
        return "Product updated successfully";
    }

    @Override
    public String deleteProduct(Long prodId) {
        repo.deleteById(prodId);
        return "Product deleted successfully";
    }

    @Override
    public ProductResponseDto viewProduct(Long prodId) {
        Product prod = repo.findById(prodId)
                           .orElseThrow(() -> new RuntimeException("Product not found with ID: " + prodId));
        return mapToDto(prod);
    }

    @Override
    public List<ProductResponseDto> viewAllProduct() {
        List<Product> products = repo.findAll();
        List<ProductResponseDto> dtoList = new ArrayList<>();

        for (Product prod : products) {
            dtoList.add(mapToDto(prod)); // Reusing the helper method
        }

        return dtoList;
    }

  
    private ProductResponseDto mapToDto(Product prod) {
        return new ProductResponseDto(
            prod.getId(),
            prod.getName(),
            prod.getDescription(),
            prod.getPrice(),
            prod.getPhotoUrl()
        );
    }
}