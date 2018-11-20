package com.wandou.tk.util;

import com.wandou.tk.mapper.GlobalIdMapper;
import com.wandou.tk.po.GlobalId;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.TimeZone;

/**
 * @author liming
 * @date 2018/9/27 10:57
 * @description
 * @modify
 */
@Component
public class IdUtil {

    @Autowired
    private GlobalIdMapper globalIdMapper;


    public Long genGlobalId(int itype, String requestIp) {
        GlobalId globalId = new GlobalId(null, itype, null, null, requestIp);
        int insert = globalIdMapper.insertSelective(globalId);
        if (insert > 0) {
            System.out.println(globalId);
            return globalId.getId();
        }
        return null;
    }

    public String genNo() {
        String dateStr = DateFormatUtils.format(new Date(), "yyMMddHHmmssSSS", TimeZone.getTimeZone("Asia/Shanghai"));
        dateStr = dateStr.substring(2);
        StringBuffer sb = new StringBuffer(dateStr);
        sb.insert(1, "01");
        return sb.toString();
    }
}
