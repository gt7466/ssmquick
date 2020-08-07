package com.gt.dao;
import com.gt.entity.User;
//import org.apache.ibatis.annotations.Mapper;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
import java.util.List;

public interface UserDao {
    User find(int id);
}
