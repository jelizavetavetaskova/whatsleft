package dev.vulpden.whatsleft.product.repo;

import dev.vulpden.whatsleft.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product, Long> {
}
