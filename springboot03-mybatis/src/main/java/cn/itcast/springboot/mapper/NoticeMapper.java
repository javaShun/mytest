package cn.itcast.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.itcast.springboot.domain.Notice;

@Mapper
public interface NoticeMapper {

	public Long count();
	public List<Notice> findAll(@Param("page")Integer page, @Param("rows")Integer rows);
	
}
