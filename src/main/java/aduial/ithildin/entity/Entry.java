package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "ENTRY")
public class Entry {

  @DatabaseField(id = true)
  private Integer id;
  @DatabaseField
  private Integer formId;
  @DatabaseField
  private Integer languageId;
  @DatabaseField
  private Integer glossId;
  @DatabaseField
  private Integer catId;
  @DatabaseField
  private Integer ruleFormId;
  @DatabaseField
  private Integer fromFormId;
  @DatabaseField
  private Integer stemFormId;
  @DatabaseField
  private String tengwar;
  @DatabaseField
  private String mark;
  @DatabaseField
  private String eldamoPageid;
  @DatabaseField
  private String orderfield;
  @DatabaseField
  private Integer orthoFormId;
  @DatabaseField
  private Integer parentId;
  @DatabaseField
  private Integer ordering;
  @DatabaseField
  private Integer entrytypeId;

  protected Entry() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getFormId() {
    return formId;
  }

  public void setFormId(Integer formId) {
    this.formId = formId;
  }


  public Integer getLanguageId() {
    return languageId;
  }

  public void setLanguageId(Integer languageId) {
    this.languageId = languageId;
  }


  public Integer getGlossId() {
    return glossId;
  }

  public void setGlossId(Integer glossId) {
    this.glossId = glossId;
  }


  public Integer getCatId() {
    return catId;
  }

  public void setCatId(Integer catId) {
    this.catId = catId;
  }


  public Integer getRuleFormId() {
    return ruleFormId;
  }

  public void setRuleFormId(Integer ruleFormId) {
    this.ruleFormId = ruleFormId;
  }


  public Integer getFromFormId() {
    return fromFormId;
  }

  public void setFromFormId(Integer fromFormId) {
    this.fromFormId = fromFormId;
  }


  public Integer getStemFormId() {
    return stemFormId;
  }

  public void setStemFormId(Integer stemFormId) {
    this.stemFormId = stemFormId;
  }


  public String getTengwar() {
    return tengwar;
  }

  public void setTengwar(String tengwar) {
    this.tengwar = tengwar;
  }


  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }


  public String getEldamoPageid() {
    return eldamoPageid;
  }

  public void setEldamoPageid(String eldamoPageid) {
    this.eldamoPageid = eldamoPageid;
  }


  public String getOrderfield() {
    return orderfield;
  }

  public void setOrderfield(String orderfield) {
    this.orderfield = orderfield;
  }


  public Integer getOrthoFormId() {
    return orthoFormId;
  }

  public void setOrthoFormId(Integer orthoFormId) {
    this.orthoFormId = orthoFormId;
  }


  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }


  public Integer getOrdering() {
    return ordering;
  }

  public void setOrdering(Integer ordering) {
    this.ordering = ordering;
  }


  public Integer getEntrytypeId() {
    return entrytypeId;
  }

  public void setEntrytypeId(Integer entrytypeId) {
    this.entrytypeId = entrytypeId;
  }

}
