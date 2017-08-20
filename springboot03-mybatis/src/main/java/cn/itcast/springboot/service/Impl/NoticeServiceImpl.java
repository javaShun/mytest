package cn.itcast.springboot.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.springboot.domain.Notice;
import cn.itcast.springboot.mapper.NoticeMapper;
import cn.itcast.springboot.service.NoticeService;
@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeMapper noticemapper;
	//查询所有数据

		@Override
		public Map<String, Object> findAll(Integer page, Integer rows) {
			// TODO Auto-generated method stub
			Map<String, Object> data = new HashMap<>();
			Long count = noticemapper.count();
			data.put("total", count);
			List<Notice> notices = noticemapper.findAll((page-1)*rows, rows);
			data.put("rows", notices);
			return data;
		
		
		}

}
