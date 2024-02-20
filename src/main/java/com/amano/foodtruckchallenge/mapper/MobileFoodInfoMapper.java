package com.amano.foodtruckchallenge.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.amano.foodtruckchallenge.entity.po.MobileFoodInfoPO;

/**
 * (MobileFoodInfo)表数据库访问层
 *
 * @author amano
 * @since 2024-02-20 17:49:00
 */
public interface MobileFoodInfoMapper extends BaseMapper<MobileFoodInfoPO> {

/**
* 批量新增数据（MyBatis原生foreach方法）
*
* @param entities List<MobileFoodInfo> 实例对象列表
* @return 影响行数
*/
int insertBatch(@Param("collection") List<MobileFoodInfoPO> entities);

/**
* 批量新增或按主键更新数据（MyBatis原生foreach方法）
*
* @param entities List<MobileFoodInfo> 实例对象列表
* @return 影响行数
* @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
*/
int insertOrUpdateBatch(@Param("collection") List<MobileFoodInfoPO> entities);
/**
* 按主键更新非null非空数据（MyBatis原生方法）
*
* @param entity MobileFoodInfo 实例对象
* @return 影响行数
*/
int updateWithoutBlank(MobileFoodInfoPO entity);
}

