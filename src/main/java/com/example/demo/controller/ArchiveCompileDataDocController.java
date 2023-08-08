package com.example.demo.controller;

import com.example.demo.entity.ArchiveCompileDataDoc;
import com.example.demo.service.IArchiveCompileDataDocService;
import com.example.demo.service.impl.ArchiveCompileDataDocServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 档案编研-文档内容 前端控制器
 * </p>
 *
 * @author shaoshuai
 * @since 2023-08-08
 */
@RestController
@RequestMapping("/archiveCompileDataDoc")
public class ArchiveCompileDataDocController {

    @Autowired
    IArchiveCompileDataDocService archiveCompileDataDocService;

    @GetMapping("/getAll")
    public Object getAll(){
        List<ArchiveCompileDataDoc> list = archiveCompileDataDocService.list();
        return list;
    }

}
