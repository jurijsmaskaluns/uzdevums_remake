package webapp.boundery;

import webapp.model.ProductEntity;


import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;

@Named
@ViewScoped

public class NewProductBean implements Serializable{

    @PersistenceContext
    private EntityManager em;
    private ProductEntity product = new ProductEntity();
    @Transactional
    public String createProduct(){
        product.setStatus("1");
        em.persist(product);
        return null;
    }



    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

}
