package com.fosun.meeting.dao;

import com.fosun.meeting.model.t_student;
import com.fosun.meeting.model.t_studentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface t_studentMapper {
    int countByExample(t_studentExample example);

    int deleteByExample(t_studentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(t_student record);

    int insertSelective(t_student record);

    List<t_student> selectByExample(t_studentExample example);

    t_student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") t_student record, @Param("example") t_studentExample example);

    int updateByExample(@Param("record") t_student record, @Param("example") t_studentExample example);

    int updateByPrimaryKeySelective(t_student record);

    int updateByPrimaryKey(t_student record);
}