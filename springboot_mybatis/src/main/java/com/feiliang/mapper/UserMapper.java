package com.feiliang.mapper;

import com.feiliang.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> QueryUserList();

}
