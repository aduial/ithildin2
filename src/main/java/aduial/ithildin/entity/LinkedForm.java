package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by luthien on 19/03/2021.
 */
@DatabaseTable(tableName = "LINKED_FORM")
public class LinkedForm implements Root {

    @DatabaseField(index = true)
    private Integer linkedId;
    @DatabaseField(index = true)
    private Integer formId;
    @DatabaseField(index = true)
    private Integer ordering;

    public Integer getLinkedId() {
        return linkedId;
    }

    public void setLinkedId(Integer linkedId) {
        this.linkedId = linkedId;
    }

    public Integer getFormId() {
        return formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }
}
