package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lixiaohui
 * @email lxh@atguigu.com
 * @date 2020-08-11 17:55:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
