package com.aitew.Manager.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aitew.Manager.service.BaseInformationService;
import com.aitew.Manager.service.BatchService;
import com.aitew.Manager.service.ClassNameService;
import com.aitew.Manager.service.RecommendService;
import com.aitew.Manager.service.TalkService;
import com.aitew.Manager.service.TeacherService;
import com.aitew.Manager.vo.BaseInformation;
import com.aitew.Manager.vo.Recommend;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/export")
public class ExportController {
	@Autowired
	private PrintContoller print;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private TalkService talkService;
	@Autowired
	private BaseInformationService baseInformationService;
	@Autowired
	private ClassNameService classNameService;
	@Autowired
	private BatchService batch;
	@Autowired
	private RecommendService re;
	
	
	
	public static void createWord(OutputStream out, String templatePath, Object props) {
    Writer wrter = null;
    Configuration configuration = new Configuration();
    configuration.setDefaultEncoding("utf-8");
    // 模板加载路径
    configuration.setClassForTemplateLoading(ExportController.class, "/templates");
    Template t = null;
    try {
        t = configuration.getTemplate(templatePath);
        wrter = new OutputStreamWriter(out, "utf-8");
        t.process(props, wrter);
        wrter.flush();
       
    } catch (Exception ex) {
        ex.getMessage();
          } finally {
        if (null != wrter) {
            try {
                wrter.close();
            } catch (IOException e) {
               e.getMessage(); 
            }
        }
    }
   
}

//批量打印到一个
@RequestMapping("/word")
public void export_oneword(@RequestParam(required = false,defaultValue = "") String[] check, String table_name, ModelMap m, HttpServletRequest request,
						   HttpServletResponse response) throws IOException {
	 List<BaseInformation> list = new ArrayList<BaseInformation>();

	String folderName="Word";
	String fold="doc";
	String rePath=request.getSession().getServletContext().getRealPath("/")+"WEB-INF/"+fold+"/";
	String realPath = request.getSession().getServletContext().getRealPath("/")+"WEB-INF/"+folderName+"/";
	System.out.println(check.length);
	if (check.equals("")||check.equals(null)||check.length<=0){
		System.out.println("执行到这里了");
		if(table_name.equals("bases")) {
			String outputFile = "入党申请人基本情况登记空表"+".doc";
			System.out.println(rePath);
			System.out.println(outputFile);
			down(request, response, rePath, outputFile);
		}else if(table_name.equals("talk")) {
			String outputFile = "党支部派人谈话记录空表"+".doc";
			down(request, response, rePath, outputFile);
		}else if(table_name.equals("recommend")) {
			String outputFile = "入党积极分子推荐确定和备案情况登记空表"+".doc";

			down(request, response, rePath, outputFile);
		}else if(table_name.equals("work")) {
			String outputFile = "发展党员工作部门联审征求意见空表"+".doc";
			down(request, response, rePath, outputFile);
		}else if(table_name.equals("prepare")) {
			String outputFile = "发展对象确定备案情况登记空表"+".doc";
			down(request, response, realPath, outputFile);
		}else if(table_name.equals("perspect")) {
			String outputFile = "预审情况登记空表"+".doc";
			download(request, response, rePath, outputFile);
		}else if(table_name.equals("education")) {
			String outputFile = "入党积极分子培养和教育考察情况登记空表"+".doc";
			down(request, response, rePath, outputFile);
		}else if(table_name.equals("receive")) {
			String outputFile = "接收预备党员表决票空表"+".doc";
			down(request, response, rePath, outputFile);
		}

	}else {
		for(int i=0;i<check.length;i++) {
			list.add(baseInformationService.findById(check[i]));
		}

		m.put("b", list);
		if(table_name.equals("bases")) {
			String outputFile = "入党申请人基本情况登记表"+".doc";
			OutputStream out = new FileOutputStream(realPath+outputFile);
			createWord(out, "/bases.ftl", m);
			download(request, response, realPath, outputFile);
		}else if(table_name.equals("talk")) {
			String outputFile = "党支部派人谈话记录表"+".doc";
			OutputStream out = new FileOutputStream(realPath+outputFile);
			createWord(out, "/talk.ftl", m);
			download(request, response, realPath, outputFile);
		}else if(table_name.equals("recommend")) {
			String outputFile = "入党积极分子推荐确定和备案情况登记表"+".doc";
			OutputStream out = new FileOutputStream(realPath+outputFile);
			createWord(out, "/recommend_p.ftl", m);
			download(request, response, realPath, outputFile);
		}else if(table_name.equals("work")) {
			String outputFile = "发展党员工作部门联审征求意见表"+".doc";
			OutputStream out = new FileOutputStream(realPath+outputFile);
			createWord(out, "/work.ftl", m);
			download(request, response, realPath, outputFile);
		}else if(table_name.equals("prepare")) {
			String outputFile = "发展对象确定备案情况登记表"+".doc";
			OutputStream out = new FileOutputStream(realPath+outputFile);
			createWord(out, "/prepare.ftl", m);
			download(request, response, realPath, outputFile);
		}else if(table_name.equals("perspect")) {
			String outputFile = "预审情况登记表"+".doc";
			OutputStream out = new FileOutputStream(realPath+outputFile);
			createWord(out, "/perspect.ftl", m);
			download(request, response, realPath, outputFile);
		}else if(table_name.equals("education")) {
			String outputFile = "入党积极分子培养和教育考察情况登记表"+".doc";
			OutputStream out = new FileOutputStream(realPath+outputFile);
			createWord(out, "/education.ftl", m);
			download(request, response, realPath, outputFile);
		}else if(table_name.equals("receive")) {
			String outputFile = "接收预备党员表决票"+".doc";
			OutputStream out = new FileOutputStream(realPath+outputFile);
			createWord(out, "/receive.ftl", m);
			download(request, response, realPath, outputFile);
		}
	}

}
@RequestMapping("/word_batch")
public void export_word_batch(String table_name,String type,String batch_id,ModelMap m,HttpServletRequest request,
		HttpServletResponse response) throws IOException {
	List<BaseInformation> list=new ArrayList<>();
	if(type.equals("active")) {
		//查找该批次下的所有积极分子
		list.addAll(baseInformationService.findByBatch(batch.findOne(batch_id)));
	}else if(type.equals("develop")){
		 List<Recommend> r= re.findAllRecommend();
		 for(int i=0;i<r.size();i++) {
				
				if(batch_id.equals(baseInformationService.findById(r.get(i).getId()).getBatch().getBatch_id())) {
					list.add(baseInformationService.findById(r.get(i).getId()));
				}
			}
	}
	String folderName="Word";
	String realPath = request.getSession().getServletContext().getRealPath("/")+"WEB-INF/"+folderName+"/";

	m.put("b", list);
	if(table_name.equals("bases")) {
		String outputFile = "入党申请人基本情况登记表"+".doc";
		OutputStream out = new FileOutputStream(realPath+outputFile);
	    createWord(out, "/bases.ftl", m);
	    download(request, response, realPath, outputFile);
		}else if(table_name.equals("talk")) {
			String outputFile = "党支部派人谈话记录表"+".doc";
			OutputStream out = new FileOutputStream(realPath+outputFile);
		    createWord(out, "/talk.ftl", m);
		    download(request, response, realPath, outputFile);
		}else if(table_name.equals("recommend")) {
			String outputFile = "入党积极分子推荐确定和备案情况登记表"+".doc";
			OutputStream out = new FileOutputStream(realPath+outputFile);
		    createWord(out, "/recommend_p.ftl", m);
		    download(request, response, realPath, outputFile);
		}else if(table_name.equals("work")) {
			String outputFile = "发展党员工作部门联审征求意见表"+".doc";
			OutputStream out = new FileOutputStream(realPath+outputFile);
		    createWord(out, "/work.ftl", m);
		    download(request, response, realPath, outputFile);
		}else if(table_name.equals("prepare")) {
			String outputFile = "发展对象确定备案情况登记表"+".doc";
			OutputStream out = new FileOutputStream(realPath+outputFile);
		    createWord(out, "/prepare.ftl", m);
		    download(request, response, realPath, outputFile);
		}else if(table_name.equals("perspect")) {
			String outputFile = "预审情况登记表"+".doc";
			OutputStream out = new FileOutputStream(realPath+outputFile);
		    createWord(out, "/perspect.ftl", m);
		    download(request, response, realPath, outputFile);
		}else if(table_name.equals("education")) {
			String outputFile = "入党积极分子培养和教育考察情况登记表"+".doc";
			OutputStream out = new FileOutputStream(realPath+outputFile);
		    createWord(out, "/education.ftl", m);
		    download(request, response, realPath, outputFile);
		}else if(table_name.equals("receive")) {
			String outputFile = "接收预备党员表决票"+".doc";
			OutputStream out = new FileOutputStream(realPath+outputFile);
		    createWord(out, "/receive.ftl", m);
		    download(request, response, realPath, outputFile);
		}
}



	//Down word from linux
public static void download(HttpServletRequest request,
		HttpServletResponse response, String fileUrl, String fileName) {
	java.io.BufferedInputStream bis = null;
	java.io.BufferedOutputStream bos = null;
	try {
		// 客户使用保存文件的对话框：
		fileUrl = fileUrl + fileName;
		//fileUrl = new String((fileUrl + fileName).getBytes("utf-8"), "utf-8");
		//String userAgent = request.getHeader("User-Agent");
		//byte[] bytes = userAgent.contains("MSIE") ? fileName.getBytes() : fileName.getBytes("UTF-8");// fileName.getBytes("UTF-8")处理safari的乱码问题
		//fileName = new String(bytes, "ISO-8859-1");// 各浏览器基本都支持ISO编码

		response.setContentType("multipart/form-data");
		response.setCharacterEncoding("utf-8");
		response.setHeader("Content-disposition", "attachment; filename=" + java.net.URLEncoder.encode(fileName, "UTF-8"));
		// 通知客户文件的MIME类型：
		bis = new java.io.BufferedInputStream(new java.io.FileInputStream((fileUrl)));
		bos = new java.io.BufferedOutputStream(response.getOutputStream());
		byte[] buff = new byte[2048];
		int bytesRead;
		int i = 0;

		while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
			bos.write(buff, 0, bytesRead);
			i++;
		}
		bos.flush();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if (bis != null) {
			try {
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bis = null;
		}
		if (bos != null) {
			try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bos = null;
		}
		 File deleteFile=new File(fileUrl); 
         deleteFile.delete();
	}
}
	public static void down(HttpServletRequest request,
								HttpServletResponse response, String fileUrl, String fileName) {
		java.io.BufferedInputStream bis = null;
		java.io.BufferedOutputStream bos = null;
		try {
			// 客户使用保存文件的对话框：
			fileUrl = fileUrl + fileName;
			//fileUrl = new String((fileUrl + fileName).getBytes("utf-8"), "utf-8");
			//String userAgent = request.getHeader("User-Agent");
			//byte[] bytes = userAgent.contains("MSIE") ? fileName.getBytes() : fileName.getBytes("UTF-8");// fileName.getBytes("UTF-8")处理safari的乱码问题
			//fileName = new String(bytes, "ISO-8859-1");// 各浏览器基本都支持ISO编码

			response.setContentType("multipart/form-data");
			response.setCharacterEncoding("utf-8");
			response.setHeader("Content-disposition", "attachment; filename=" + java.net.URLEncoder.encode(fileName, "UTF-8"));
			// 通知客户文件的MIME类型：
			bis = new java.io.BufferedInputStream(new java.io.FileInputStream((fileUrl)));
			bos = new java.io.BufferedOutputStream(response.getOutputStream());
			byte[] buff = new byte[2048];
			int bytesRead;
			int i = 0;

			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
				i++;
			}
			bos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bis = null;
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bos = null;
			}


		}
	}


}
