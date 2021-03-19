package aduial.ithildin.entity;

import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by luthien on 18/02/2021.
 */
@DatabaseTable(tableName = "cat")
public class Cat {

  @Id
  private Long id;
  private String label;
  private Long parentId;

  protected Cat() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

}
