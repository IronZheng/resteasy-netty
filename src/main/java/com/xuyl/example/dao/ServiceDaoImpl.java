package com.xuyl.example.dao;

import com.sun.deploy.services.Service;
import com.xuyl.example.jdbc.JdbcUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2017/7/17.
 */
public class ServiceDaoImpl implements ServiceDao {

    private static JdbcUtil jdbcUtil = new JdbcUtil();;

    @Override
    public List<Map<String, Object>> getAllServiceDao() {
        String sql = "select * from dbbatch_server";
        //创建填充参数的list
        List<Object> paramList = new ArrayList<Object>();
        List<Map<String, Object>> mapList = new ArrayList<>();
        jdbcUtil.getConnection(); // 获取数据库链接
        try {
            mapList = jdbcUtil.findResult(
                    sql.toString(), paramList);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (jdbcUtil != null) {
                jdbcUtil.releaseConn(); // close
            }
        }
        return mapList;
    }
}
