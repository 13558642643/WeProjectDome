package com.zshnamexy.namexyzsh.contaller;

import com.zshnamexy.namexyzsh.server.NameUserServer;
import io.swagger.annotations.ApiOperation;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/name")
@EnableSwagger2
public class NameUserContallerImpl {
    @Autowired
    private NameUserServer nameUserServer;

   @ApiOperation(value = "获取列表",notes = "")
    @RequestMapping("user")
    @ResponseBody
    public Map<String,Object> selectIddssa() {
       // List<NameUser> nameUsers = nameUserServer.selectIddssa();
        Map<String,Object> map = new HashMap<>();
        map.put("sss","ssss");
        map.put("aaa","aaa");
        JSONObject j = new JSONObject(new JSONObject(map));
        System.out.println( j.toString());

        return map;
    }


}
