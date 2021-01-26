package e3.mall.mapper;

import e3.mall.beans.Emp;
import org.apache.ibatis.transaction.TransactionFactory;
import org.mybatis.spring.annotation.MapperScan;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author
 * @Package e3.mall.mapper
 * @date 2020/12/15 10:44
 * @Copyright
 */

public interface EmpMapper {

  Emp getEmpByID(int empID);

  List<Emp> getAll();
}
