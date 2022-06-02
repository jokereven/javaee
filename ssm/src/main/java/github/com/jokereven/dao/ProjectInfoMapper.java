package github.com.jokereven.dao;

import github.com.jokereven.entity.ProjectInfo;
import github.com.jokereven.entity.ProjectInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

public interface ProjectInfoMapper {
    //统计数量
    long countByExample(ProjectInfoExample example);

    //根据条件删除
    int deleteByExample(ProjectInfoExample example);

    //根据主键删除
    int deleteByPrimaryKey(Integer piId);

    //添加
    int insert(ProjectInfo record);

    //有选择的添加
    int insertSelective(ProjectInfo record);

    //根据条件查询
    List<ProjectInfo> selectByExample(ProjectInfoExample example);

    //根据主键查询
    ProjectInfo selectByPrimaryKey(Integer piId);

    //根据条件有选择的修改
    int updateByExampleSelective(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    //根据条件修改所有
    int updateByExample(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    // 根据主键有选择的修改
    int updateByPrimaryKeySelective(ProjectInfo record);

    //根据主键修改
    int updateByPrimaryKey(ProjectInfo record);

    /*
     * =============================================================
     * 以上自动生成的都是单表操作，所有两表联查需要自己创建
     * */

    //根据条件两表联查所有信息
    List<ProjectInfo> selectByExampleWithApplicant(ProjectInfoExample example);
    //根据主键两表联查单个信息
    ProjectInfo selectByPrimaryKeyWithApplicant(Integer piId);
}