package e3.mall.service;

import e3.mall.beans.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @Package e3.mall.service
 * @date 2020/12/15 11:13
 * @Copyright
 */

public interface EmpService {
  Emp getEmpByID(int empID);

  List<Emp> getAll();
}
