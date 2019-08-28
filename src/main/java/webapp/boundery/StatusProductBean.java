package webapp.boundery;

import webapp.model.ProductEntity;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Named
@Stateless
public class StatusProductBean {
    @PersistenceContext
    private EntityManager em;
    private ProductEntity product = new ProductEntity();
    @Transactional
    public void confirmProduct(int id){
        product = em.find(ProductEntity.class, id );
        product.setStatus("2");
        em.persist(product);
    }
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
