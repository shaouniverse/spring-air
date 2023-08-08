package com.example.demo.tool;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;

public class ExecuteMybatis {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://192.168.80.39:3306/dams_server_bak?useUnicode=true&characterEncoding=utf8&nullCatalogMeansCurrent=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=GMT%2B8",
                "dams_server",
                "TR54e$%STs#h")
                .globalConfig(builder -> {
                    builder.author("shaoshuai")
                            .outputDir("C:\\Users\\86183\\Desktop\\dda");
                })
                .strategyConfig(builder -> {
                    builder.addInclude("archive_compile_data_doc")
                            //实体文件覆盖
                            .entityBuilder()
                            .idType(IdType.ASSIGN_UUID)
                            .enableLombok()
                            //Mapper文件覆盖
                            .mapperBuilder().enableFileOverride()
                            //Service文件覆盖
                            .serviceBuilder().enableFileOverride()
                            //Controller文件覆盖
                            .controllerBuilder().enableFileOverride();
                })
                .execute();
    }
}
