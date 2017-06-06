package com.jk.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 2017/6/6.
 */
@Controller
@RequestMapping("/fm")
public class FreeMarkerController {

    @RequestMapping("test1")
    public void test1(String name, HttpServletRequest request, HttpServletResponse response) {
        System.out.println(name);

        //生成静态页面
        //实例化Configuration
        Configuration cg = new Configuration();
        cg.setDefaultEncoding("utf-8");

        //设置模版所在路径
        cg.setServletContextForTemplateLoading(request.getSession().getServletContext(), "/template");

        //获取模版
        try {
            Template template = cg.getTemplate("test.ftl");
            template.setEncoding("utf-8");
            Map<String, Object> m = new HashMap<String, Object>();
            m.put("name", name);

            PrintWriter writer = response.getWriter();
            template.process(m, writer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
