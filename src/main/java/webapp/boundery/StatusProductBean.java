package webapp.boundery;

import webapp.model.ProductEntity;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;

@Named
@SessionScoped
public class StatusProductBean implements Serializable {
    @PersistenceContext
    private EntityManager em;
    private ProductEntity product = new ProductEntity();
    @Transactional
    public void confirmProduct(int id){
        product = em.find(ProductEntity.class, id );
        product.setStatus("2");
        em.persist(product);
    }
    @Transactional
    public void rejectProduct(int id){
        product = em.find(ProductEntity.class, id );
        product.setStatus("3");
        em.persist(product);
    }

//
//    public ProductEntity getProduct() {
//        return product;
//    }
//
//    public void setProduct(ProductEntity product) {
//        this.product = product;
//    }
}
