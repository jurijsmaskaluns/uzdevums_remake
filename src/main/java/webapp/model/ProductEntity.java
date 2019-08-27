package webapp.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="Product")
public class ProductEntity {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;
    @Column
    private LocalDateTime created;
    @Column
    private String productType;
    @Column
    private String status;

    @PrePersist
    public void onCreated(){
        created = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    @Override
//    public String toString() {
//        return "ProductEntity{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", created=" + created +
//                ", productType='" + productType + '\'' +
//                ", status='" + status + '\'' +
//                '}';
//    }
}
