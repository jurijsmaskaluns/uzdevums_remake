package webapp.boundery;

import webapp.model.ProductEntity;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;

@Named
@RequestScoped

public class NewProductBean {

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
