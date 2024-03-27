package rupp.com.kh.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rupp.com.kh.cms.Entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Long>{
    
}
