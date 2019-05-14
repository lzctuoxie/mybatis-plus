package cn.itsource.mybatisplus.service.impl;

import cn.itsource.mybatisplus.domain.User;
import cn.itsource.mybatisplus.mapper.UserMapper;
import cn.itsource.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lzctuoxie
 * @version v1.0
 * @description: TODO
 * @date 2019/5/14
 * @ClassName:
 */
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService{
}
