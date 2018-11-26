package org.snu.practice4.mapper;

import org.apache.ibatis.annotations.*;
import org.snu.practice4.dto.PayInfo;

import java.util.List;

@Mapper
public interface PayInfoMapper {

    @Select("SELECT * from pay_info")
    List<PayInfo> findAll();

    @Select("SELECT * FROM pay_info WHERE id = #{id}")
    PayInfo findById(@Param("id") final int id);

    @Insert("INSERT INTO pay_info(info) VALUES(#{payInfo.info})")
    @Options(useGeneratedKeys = true, keyColumn = "payInfo.id")
    int save(@Param("payInfo") final PayInfo payInfo);

}
