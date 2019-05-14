package cn.itsource.mybatisplus.mapper;

import cn.itsource.mybatisplus.domain.Employee;
import cn.itsource.mybatisplus.query.EmployeeQuery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lzctuoxie
 * @since 2019-05-14
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
    IPage<Employee> selectByQuery(Page<Employee> page, EmployeeQuery query);

}
