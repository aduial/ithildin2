package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "REFCOGNATEVIEW")
public class RefCognateView{

  public static final String ENTRYID_FIELD_NAME = "ENTRY_ID";

  @DatabaseField
  private Integer   entryId;
  @DatabaseField
  private String lang;
  @DatabaseField
  private String form;
  @DatabaseField
  private String gloss;
  @DatabaseField
  private String sources;

  protected RefCognateView() {}

  public Integer getEntryId() {
    return entryId;
  }

  public void setEntryId(Integer entryidfrom) {
    this.entryId = entryidfrom;
  }


  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }


  public String getForm() {
    return form;
  }

  public void setForm(String form) {
    this.form = form;
  }


  public String getGloss() {
    return gloss;
  }

  public void setGloss(String gloss) {
    this.gloss = gloss;
  }


  public String getSources() {
    return sources;
  }

  public void setSources(String sources) {
    this.sources = sources;
  }

}
