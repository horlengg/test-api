package rupp.com.kh.cms.dto;

public class ProductDTO {

    private String productName;
    private String productPrice;
    private String productQty;

    
    public ProductDTO(){}
    public ProductDTO(String productName, String productPrice, String productQty) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQty = productQty;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
    public String getProductQty() {
        return productQty;
    }
    public void setProductQty(String productQty) {
        this.productQty = productQty;
    }
    


    
}
