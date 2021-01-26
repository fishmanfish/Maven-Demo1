package e3.mall.beans;

import lombok.Data;

import java.io.Serializable;

/**
 * @author
 * @Package e3.mall
 * @date 2020/12/7 15:42
 * @Copyright
 */
@Data
public class Emp implements Serializable {
  private static final long serialVersionUID = 8369795664553242505L;

  private int empID;
  private String empName;
  private int deptID;
  private double money;
  private int gender;
  private String empImg;
}
