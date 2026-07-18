package dev.vulpden.whatsleft.product;

import dev.vulpden.whatsleft.product.dto.ProductDto;
import dev.vulpden.whatsleft.product.model.Product;

public class ProductMapper {
    public static ProductDto toDto(Product product) {
        ProductDto dto = new ProductDto();
        dto.setTitle(product.getTitle());
        return dto;
    }
}
