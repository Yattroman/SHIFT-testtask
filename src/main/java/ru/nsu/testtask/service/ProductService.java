package ru.nsu.testtask.service;

import org.springframework.stereotype.Service;
import ru.nsu.testtask.data.entity.Product;
import ru.nsu.testtask.repository.ProductRepository;

@Service
public class ProductService<E extends Product> extends AbstractCrudService<E>{

    private final ProductRepository<E, Integer> productRepository;

    public ProductService(ProductRepository<E, Integer> repository, ProductRepository<E, Integer> productRepository) {
        super(repository);
        this.productRepository = productRepository;
    }

    public E findProductById(int productId){
        return productRepository.getById(productId);
    }

    public void saveProduct(E product){
        productRepository.save(product);
    }

    public void deleteProduct(int productId){
        productRepository.deleteById(productId);
    }

}
