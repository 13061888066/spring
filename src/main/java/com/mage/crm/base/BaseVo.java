package com.mage.crm.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
public class BaseVo {

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8") // 输出JSON数据时的日期时间格式
    @DateTimeFormat(pattern="yyyy-MM-dd") // 传入参数的日期时间转换
    public Date createDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    public Date updateDate;
    public Integer isValid;

}
