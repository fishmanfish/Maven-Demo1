package e3.mall.controller;

import e3.mall.beans.Emp;
import e3.mall.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author
 * @Package e3.mall.controller
 * @date 2020/12/15 11:21
 * @Copyright
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

  @Autowired
  private EmpService empService;

  @ResponseBody
  @RequestMapping("/get/{empID}")
  public Emp getEmpByID(@PathVariable("empID") int empID){
    return empService.getEmpByID(empID);
  }
  @ResponseBody
  @RequestMapping("/list")
  public List<Emp> getAll(){
    return empService.getAll();
  }

}
