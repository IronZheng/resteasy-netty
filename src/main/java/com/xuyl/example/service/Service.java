package com.xuyl.example.service;

import com.xuyl.example.common.ResUtils;
import com.xuyl.example.dao.ServiceDao;
import com.xuyl.example.dao.ServiceDaoImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Created by dell on 2017/7/14.
 */
public class Service {

    private static final Logger logger = LogManager.getLogger(Service.class);

    private ServiceDao serviceDao = new ServiceDaoImpl();

    public String getAllService() {
        logger.info("getAllService service start");

        List<Map<String, Object>> mapList = serviceDao.getAllServiceDao();
        String json = ResUtils.transToJson(mapList);
        return json;
    }
}
