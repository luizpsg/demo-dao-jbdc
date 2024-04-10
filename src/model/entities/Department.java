package model.entities;

import java.io.Serializable;

public class Department implements Serializable{
  
  private static final long serialVersionUID = 1L;
  private Integer id;
  private String name;

  public Department() {
  }

  public Department(Integer id, String name) {
    setid(id);
    setname(name);
  }

  public Integer getid() {
    return id;
  }

  public void setid(Integer id) {
    this.id = id;
  }

  public String getname() {
    return name;
  }

  public void setname(String name) {
    this.name = name;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Department other = (Department) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Department [id=" + id + ", name=" + name + "]";
  }
}
