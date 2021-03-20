package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "GLOSS")
public class Gloss implements Root {

  @DatabaseField(id = true)
  private Integer id;
  @DatabaseField
  private Integer languageId;
  @DatabaseField
  private String txt;

  protected Gloss() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getLanguageId() {
    return languageId;
  }

  public void setLanguageId(Integer languageId) {
    this.languageId = languageId;
  }


  public String getTxt() {
    return txt;
  }

  public void setTxt(String txt) {
    this.txt = txt;
  }

}
