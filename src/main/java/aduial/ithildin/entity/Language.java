package aduial.ithildin.entity;

import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by luthien on 18/02/2021.
 */

@DatabaseTable(tableName = "language")
public class Language {

  @Id
  private Long id;
  private String name;
  private String mnemonic;
  private Long parentId;

  protected Language() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getMnemonic() {
    return mnemonic;
  }

  public void setMnemonic(String mnemonic) {
    this.mnemonic = mnemonic;
  }


  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

}
