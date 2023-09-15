package net.fzy.fitness.mapper;

import net.fzy.fitness.model.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int save(User user);

    User findByPhone(@Param("phone") String phone);


    User findByPhoneAndPwd(@Param("phone") String phone, @Param("pwd") String pwd);

    User findByUserId(@Param("user_id") Integer userId);
}
