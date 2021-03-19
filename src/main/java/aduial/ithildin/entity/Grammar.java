package aduial.ithildin.entity;

import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "grammar")
public class Grammar {

  @Id
  private Long id;
  private String txt;

  protected Grammar() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getTxt() {
    return txt;
  }

  public void setTxt(String txt) {
    this.txt = txt;
  }

}
