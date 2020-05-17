package com.example.mybatisplusdemo.generator.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplusdemo.generator.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author daiwenxiang
 * @since 2020-05-17
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
