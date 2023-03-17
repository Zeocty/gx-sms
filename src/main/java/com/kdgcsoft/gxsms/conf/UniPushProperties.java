package com.kdgcsoft.gxsms.conf;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: app推送配置字段
 * @Title: PushConfigProperties
 * @Package com.kdgcsoft.gxsms.conf
 * @Author: Zeocty
 * @Copyright zeocty@gmail.com
 * @CreateTime: 2023/3/16 9:44
 */
@Configuration
@ConfigurationProperties(prefix = "unipush")
@Data
@NoArgsConstructor
public class UniPushConfigProperties {
    private String appId;
    private String appKey;
    private String appSecret;
    private String masterSecret;
    private String appPushUrl;
}
