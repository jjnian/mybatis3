package cn.clean.mapper;

import cn.clean.entity.LookRecord;
import org.apache.ibatis.annotations.Param;

public interface LookRecordMapper {

    int addLookRecord(LookRecord record);

    int noSelectRecord(Integer userId);

}
