package uk.ac.sheffield.paginationdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import uk.ac.sheffield.paginationdemo.model.Product;
import uk.ac.sheffield.paginationdemo.service.ProductService;

@Controller
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String getPaginatedProducts(Pageable pageable, Model model) {
        Page<Product> productPage = productService.getPaginatedProducts(pageable);
        model.addAttribute("productPage", productPage);
        return "products";
    }
}
