package aduial.ithildin.database.pojo;

import javax.persistence.*;

@Entity
@Table(name = "CAT")
public class Cat {
    @Id
    @Column(name = "ID")
    private null id;

    @Column(name = "LABEL")
    private String label;

    @Column(name = "PARENT_ID")
    private null parentId;

    public null getId() {
        return this.id;
    }

    public void setId(null id) {
        this.id = id;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public null getParentId() {
        return this.parentId;
    }

    public void setParentId(null parentId) {
        this.parentId = parentId;
    }
}
