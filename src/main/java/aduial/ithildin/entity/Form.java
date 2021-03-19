package aduial.ithildin.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;;

/**
 * Created by luthien on 18/02/2021.
 */

@DatabaseTable(tableName = "FORM")
public class Form {

  @DatabaseField(id = true)
  private Integer id;
  @DatabaseField
  private String txt;
  @DatabaseField
  private String normaltxt;

  protected Form() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getTxt() {
    return txt;
  }

  public void setTxt(String txt) {
    this.txt = txt;
  }


  public String getNormaltxt() {
    return normaltxt;
  }

  public void setNormaltxt(String normaltxt) {
    this.normaltxt = normaltxt;
  }

}
