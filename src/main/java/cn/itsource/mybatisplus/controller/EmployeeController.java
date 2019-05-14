package cn.itsource.mybatisplus.controller;

import cn.itsource.mybatisplus.domain.Employee;
import cn.itsource.mybatisplus.query.EmployeeQuery;
import cn.itsource.mybatisplus.service.IEmployeeService;
import cn.itsource.mybatisplus.util.AjaxResult;
import cn.itsource.mybatisplus.util.PageList;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    public IEmployeeService employeeService;

    /**
    * 保存和修改公用的
    * @param employee  传递的实体
    * @return Ajaxresult转换结果
    */
    @RequestMapping(value="/add",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody Employee employee){
        try {
            if(employee.getId()!=null){
                employeeService.updateById(employee);
            }else{
                employeeService.save(employee);
            }
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("保存对象失败！"+e.getMessage());
        }
    }

    /**
    * 删除对象信息
    * @param id
    * @return
    */
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public AjaxResult delete(@PathVariable("id") Integer id){
        try {
            employeeService.removeById(id);
            return AjaxResult.me();
        } catch (Exception e) {
        e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Employee get(@RequestParam(value="id",required=true) Long id)
    {
        return employeeService.getById(id);
    }


    /**
    * 查看所有信息
    * @return
    */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Employee> list(){

        return employeeService.list();
    }

    /**
     * 分页查询数据
     *
     * @param query 查询对象
     * @return PageList 分页对象
     */
    @RequestMapping(value = "/json",method = RequestMethod.POST)
    public PageList<Employee> json(@RequestBody EmployeeQuery query)
    {
        //自己构建条件
        IPage<Employee> iPage = new Page<Employee>(query.getPage(), query.getSize());
        //条件构造器
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        if(!StringUtils.isEmpty(query.getUsername())) {
            queryWrapper.like("username", query.getUsername());
        }

        IPage<Employee> page = employeeService.page(iPage,queryWrapper);
        List<Employee> rows = page.getRecords();
        long total = page.getTotal();
        return new PageList<>(total,rows);
    }

}
