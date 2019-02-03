package app.mrquan.mapper;

import app.mrquan.pojo.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PersonMapper {
    @Select("SELECT * FROM person")
    List<Person> getAll();

    @Insert("INSERT INTO person(name,province,city,county,detailedAddress,tel) VALUES(#{name}, #{province},#{city},#{county},#{detailedAddress},#{tel})")
    void insert(Person person);
//    List<Person> listAll();
//    int insert(Person person);
}
