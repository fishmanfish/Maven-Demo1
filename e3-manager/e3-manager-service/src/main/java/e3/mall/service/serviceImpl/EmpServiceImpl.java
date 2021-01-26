package e3.mall.service.serviceImpl;

import e3.mall.beans.Emp;
import e3.mall.mapper.EmpMapper;
import e3.mall.service.EmpService;
import e3.mall.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author
 * @Package e3.mall.service.serviceImpl
 * @date 2020/12/15 11:13
 * @Copyright
 */

@Service
public class EmpServiceImpl implements EmpService {

  @Autowired
  private EmpMapper mapper;

  @Override
  public Emp getEmpByID(int empID) {
    return mapper.getEmpByID(empID);
  }

  @Override
  public List<Emp> getAll() {
    return mapper.getAll();
  }
}
