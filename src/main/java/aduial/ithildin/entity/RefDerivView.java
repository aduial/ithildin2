package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "REFDERIVVIEW")
public class RefDerivView{

  @DatabaseField
  private Integer entryId;
  @DatabaseField
  private String form;
  @DatabaseField
  private String glosses;
  @DatabaseField
  private String sources;

  protected RefDerivView() {}

  public Integer getEntryidfrom() {
    return entryId;
  }

  public void setEntryidfrom(Integer entryidfrom) {
    this.entryId = entryId;
  }


  public String getForm() {
    return form;
  }

  public void setForm(String form) {
    this.form = form;
  }


  public String getGlosses() {
    return glosses;
  }

  public void setGlosses(String glosses) {
    this.glosses = glosses;
  }


  public String getSources() {
    return sources;
  }

  public void setSources(String sources) {
    this.sources = sources;
  }

}
