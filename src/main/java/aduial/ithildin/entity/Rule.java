package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "RULE")
public class Rule {

    @DatabaseField(id = true)
    private Integer id;

    @DatabaseField
    private Integer entryId;

    @DatabaseField
    private Integer fromFormId;

    @DatabaseField
    private Integer ruleFormId;

    @DatabaseField
    private Integer languageId;

    @DatabaseField
    private Integer ordering;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEntryId() {
        return this.entryId;
    }

    public void setEntryId(Integer entryId) {
        this.entryId = entryId;
    }

    public Integer getFromFormId() {
        return this.fromFormId;
    }

    public void setFromFormId(Integer fromFormId) {
        this.fromFormId = fromFormId;
    }

    public Integer getRuleFormId() {
        return this.ruleFormId;
    }

    public void setRuleFormId(Integer ruleFormId) {
        this.ruleFormId = ruleFormId;
    }

    public Integer getLanguageId() {
        return this.languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getOrdering() {
        return this.ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }
}
