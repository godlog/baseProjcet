package org.ibase4j.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.ibase4j.core.base.BaseMapper;
import org.ibase4j.model.SysUser;

public interface SysUserMapper extends BaseMapper<SysUser> {
    List<Long> selectIdPage(@Param("cm") Map<String, Object> params);
}
