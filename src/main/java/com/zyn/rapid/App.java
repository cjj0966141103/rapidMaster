package com.zyn.rapid;

import cn.org.rapid_framework.generator.GeneratorFacade;

public class App {
    /**
     * 请直接修改以下代码调用不同的方法以执行相关生成任务.
     */
    public static void main(String[] args) throws Exception {
        GeneratorFacade g = new GeneratorFacade();
        // g.printAllTableNames(); //打印数据库中的表名称

        g.deleteOutRootDir(); // 删除生成器的输出目录
        // g.generateByTable("table_name","template");
        // //通过数据库表生成文件,template为模板的根目录
        g.getGenerator().addTemplateRootDir("E:\\workplace\\rapid\\templates");
        // 自动搜索数据库中的所有表并生成文件,template为模板的根目录
        // g.generateByClass(Blog.class,"template_clazz");

        // g.deleteByTable("table_name", "template"); //删除生成的文件
        // 生成全部表
        //		g.generateByAllTable();
        g.generateByTable("bill");
        //		g.generateByTable("function");
        //生成部分表
        //g.generateByTable("");
        
        
        //Runtime.getRuntime().exec("cmd.exe /c start " + GeneratorProperties.getRequiredProperty("outRoot"));
    }
}
