package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */

@DatabaseTable(tableName = "LEXICON")
public class Lexicon {

  @DatabaseField
  private Integer entryId;
  @DatabaseField
  private String form;
  @DatabaseField
  private String langMnemonic;
  @DatabaseField
  private String langName;
  @DatabaseField
  private String gloss;
  @DatabaseField
  private String cat;
  @DatabaseField
  private String tengwar;
  @DatabaseField
  private String mark;
  @DatabaseField
  private String eldamoPageid;
  @DatabaseField
  private String orderfield;
  @DatabaseField
  private Integer parentId;
  @DatabaseField
  private Integer ordering;
  @DatabaseField
  private Integer entrytypeId;
  @DatabaseField
  private String entryType;

  protected Lexicon() {}

  public Integer getEntryId() {
    return entryId;
  }

  public void setEntryId(Integer id) {
    this.entryId = id;
  }


  public String getForm() {
    return form;
  }

  public void setForm(String form) {
    this.form = form;
  }


  public String getLangMnemonic() {
    return langMnemonic;
  }

  public void setLangMnemonic(String langMnemonic) {
    this.langMnemonic = langMnemonic;
  }


  public String getLangName() {
    return langName;
  }

  public void setLangName(String langName) {
    this.langName = langName;
  }


  public String getGloss() {
    return gloss;
  }

  public void setGloss(String gloss) {
    this.gloss = gloss;
  }


  public String getCat() {
    return cat;
  }

  public void setCat(String cat) {
    this.cat = cat;
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


  public String getEntryType() {
    return entryType;
  }

  public void setEntryType(String entryType) {
    this.entryType = entryType;
  }

}
