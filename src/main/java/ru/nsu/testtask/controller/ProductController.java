package ru.nsu.testtask.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nsu.testtask.data.entity.Product;
import ru.nsu.testtask.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController<E extends Product>{

    private final ProductService<E> productService;

    public ProductController(ProductService<E> productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    private ResponseEntity<E> getProduct(@PathVariable("id") int id) {
        E product = productService.findProductById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<E> addNewProduct(@RequestBody E product) {
        productService.saveProduct(product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping
    private List<Product> getProductsByType(){
        return null;
    }

    @PutMapping
    private ResponseEntity<E> updateProduct(@RequestBody E product) {
        return null;
    }

    @DeleteMapping("/{id}")
    private String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "Product with ID: {" + id + "} was deleted.";
    }
}
