package com.ustcsoft.gxsms.entity;

import com.alibaba.fastjson2.JSONObject;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 短信发送实体
 * @Title: AppSendVO
 * @Package com.ustcsoft.gxsms.entity
 * @Author: Zeocty
 * @Copyright zeocty@gmail.com
 * @CreateTime: 2023/3/16 9:35
 */
@Data
public class AppSendVO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String title;
    private String content;
    private JSONObject payload;
    private String clientId;

}
