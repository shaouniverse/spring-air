package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 档案编研-文档内容
 * </p>
 *
 * @author shaoshuai
 * @since 2023-08-08
 */
@Getter
@Setter
@TableName("archive_compile_data_doc")
public class ArchiveCompileDataDoc implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 汇编专题ID
     */
    private String compileId;

    /**
     * 路径
     */
    private String filePath;

    /**
     * 名称
     */
    private String fileName;

    /**
     * 格式
     */
    private String format;

    private String htmlText;
}
