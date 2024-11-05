package com.cl.entity.view;

import com.cl.entity.ExamquestionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 试题管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-26 17:31:32
 */
@TableName("examquestion")
public class ExamquestionView  extends ExamquestionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ExamquestionView(){
	}
 
 	public ExamquestionView(ExamquestionEntity examquestionEntity){
 	try {
			BeanUtils.copyProperties(this, examquestionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
