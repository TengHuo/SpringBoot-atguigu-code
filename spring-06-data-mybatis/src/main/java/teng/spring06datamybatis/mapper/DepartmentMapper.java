package teng.spring06datamybatis.mapper;

import org.apache.ibatis.annotations.*;
import teng.spring06datamybatis.bean.Department;

@Mapper
public interface DepartmentMapper {
    @Select("SELECT * FROM department WHERE id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("DELETE FROM department WHERE id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    int insertDept(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    int updateDept(Department department);
}
