package webapp.boundery;

import webapp.model.ProductEntity;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class ProductListBean implements Serializable {

    @PersistenceContext(unitName = "myPU")
    private EntityManager em;

    public void doSearch(){
        System.out.println("Searcing ...");
  //      System.out.println(id);
    }

    public List<ProductEntity> getProduct(){
        return em.createQuery("select p from Product p", ProductEntity.class).getResultList();
    }
}
