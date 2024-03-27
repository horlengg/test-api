package rupp.com.kh.cms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rupp.com.kh.cms.Entity.ProductEntity;
import rupp.com.kh.cms.dto.ProductDTO;
import rupp.com.kh.cms.repository.ProductRepository;
import java.util.List;
import java.util.ArrayList;

@Service
public class ProductService {
    @Autowired ProductRepository productRepository;
    public List<ProductDTO> retrieveProduct(){
        List<ProductDTO> productDTOs = new ArrayList<>();
        List<ProductEntity> productEntity =  productRepository.findAll();
        for(ProductEntity pro : productEntity) {
            productDTOs.add(new ProductDTO(pro.getProductName(),pro.getProductPrice(),pro.getProductQty()));
        }

        return productDTOs;

    }
}
