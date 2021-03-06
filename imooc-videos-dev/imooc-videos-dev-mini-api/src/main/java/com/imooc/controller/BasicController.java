package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.utils.RedisOperator;

@RestController
public class BasicController {
	
	@Autowired
	public RedisOperator redis;
	
	public static final String USER_REDIS_SESSION = "user-redis-session";
	
	// 文件保存的命名空间
	public static final String FILE_SPACE = "D:\\imooc_videos_dev";
	
	// ffmpeg所在目录
	public static final String FFMPEG_EXE = "E:\\招聘\\ffmpeg\\bin\\ffmpeg.exe";
	
	// 分页后每页条数
	public static final Integer PAGE_SIZE = 5;
	
}
