package github.com.jokereven.dao;

import github.com.jokereven.entity.Applicant;
import github.com.jokereven.entity.ApplicantExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ApplicantMapper {
    //统计数量
    long countByExample(ApplicantExample example);
    //根据条件删除
    int deleteByExample(ApplicantExample example);
    //根据主键删除
    int deleteByPrimaryKey(Integer acId);
    //添加
    int insert(Applicant record);
    //有选择的添加
    int insertSelective(Applicant record);
    //根据条件查询
    List<Applicant> selectByExample(ApplicantExample example);
    //根据主键查询
    Applicant selectByPrimaryKey(Integer acId);
    //根据条件有选择的修改
    int updateByExampleSelective(@Param("record") Applicant record, @Param("example") ApplicantExample example);
    //根据条件修改所有
    int updateByExample(@Param("record") Applicant record, @Param("example") ApplicantExample example);
    // 根据主键有选择的修改
    int updateByPrimaryKeySelective(Applicant record);
    //根据主键修改
    int updateByPrimaryKey(Applicant record);
}