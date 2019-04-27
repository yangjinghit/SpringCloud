package com.yj.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.yj.Dept;
import com.yj.Student;
import com.yj.service.IDeptService;
import com.yj.service.impl.DeptServiceImpl;

@RestController
public class DeptController {
	
	private static final Log log = LogFactory.getLog(DeptController.class);
	
	@Autowired
	private IDeptService deptService;
	
	@RequestMapping("/dept/sessionId")
	public Object id(HttpServletRequest request) {
		
		return request.getSession().getId();
	}
	//private IDeptService deptService = new DeptServiceImpl();
	
	@HystrixCommand(fallbackMethod = "getFallBack")
	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public Object list() {
		if(log.isTraceEnabled()) {
			log.trace("=============/dept/list=======");
		}
		if(true) {
			throw new RuntimeException("list error");

		}
		
		return this.deptService.findAll();
		
	}
	
	public Object getFallBack() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1111l, "1111", 1111));
		
		return students;
		
		
	}
	
	@RequestMapping("/dept/{id}")
	public Object getOne(@PathVariable int id) {
		
		if(id == 1) {
			Student student = new Student();
			return student;
		} else {
			throw new ResourceNotFoundException();
		}
		
	}
	
	@RequestMapping(value = "/dept", method = RequestMethod.POST)
    public Student insertOne(@RequestBody Student student) {
        
        student.setId(9999l);
        return student;
    }
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Map<String, String> deleteOne(@PathVariable int id, HttpServletRequest request, 
                @RequestParam(value="delete_reason", required=false) String deleteReason) throws Exception{
        if(log.isTraceEnabled()) {
            log.trace("deleteOne " + id);
        }
        Map<String, String> result = new HashMap<>();
        if(id == 101) {
            //TODO: 执行删除的代码
            result.put("message", "#101被" + request.getRemoteAddr() + "删除(原因：" + deleteReason + ")");
        }else if(id == 102) {
            //不能删除这个，RuntimeException不如org.springframework.security.access.AccessDeniedException更合适
            //但此处还没到spring security，所以暂先抛出RuntimeException异常
            throw new RuntimeException("#102不能删除");
        }else {
            //不存在
            throw new ResourceNotFoundException();
        }
        return result;
    }
	
	@PostMapping(value="/{id}/photos", consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
    public void addPhoto(@PathVariable int id, @RequestParam("photo") MultipartFile imgFile) throws Exception{
        if(log.isTraceEnabled()) {
            log.trace("接受到文件 " + id + "收到文件：" + imgFile.getOriginalFilename());
        }
        //保存文件
        FileOutputStream fos = new FileOutputStream("target/" + imgFile.getOriginalFilename());
        IOUtils.copy(imgFile.getInputStream(), fos);
        fos.close();
    }
	
	@GetMapping(value="/{id}/icon", produces=MediaType.IMAGE_JPEG_VALUE)
    public byte[] getIcon(@PathVariable int id) throws Exception{
        if(log.isTraceEnabled()) {
            log.trace("getIcon(" + id + ")");
        }
        String iconFile = "src/test/resources/icon.jpg";
        InputStream is = new FileInputStream(iconFile);
        byte[] data = null;
        IOUtils.readFully(is, data);
        //byte[] data = IOUtils.toByteArray(is);
        is.close();
        return data;
    }
	
	

}
