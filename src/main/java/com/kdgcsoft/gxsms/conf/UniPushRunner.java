package com.ustcsoft.gxsms.conf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class UniPushRunner implements ApplicationRunner {

    @Autowired
    UniPushConfigPropoties uniPushConfigPropoties;

    @Override
    public void run(ApplicationArguments args) {
//        AppPushUtil.creatApi(uniPushConfigPropoties.getAppId(), uniPushConfigPropoties.getAppKey(),
//                uniPushConfigPropoties.getMasterSecret(), uniPushConfigPropoties.getAppPushUrl());
    }
}
