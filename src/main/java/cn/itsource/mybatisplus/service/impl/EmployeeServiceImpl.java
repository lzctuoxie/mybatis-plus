package cn.itsource.mybatisplus.service.impl;

import cn.itsource.mybatisplus.domain.Employee;
import cn.itsource.mybatisplus.mapper.EmployeeMapper;
import cn.itsource.mybatisplus.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lzctuoxie
 * @since 2019-05-14
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
