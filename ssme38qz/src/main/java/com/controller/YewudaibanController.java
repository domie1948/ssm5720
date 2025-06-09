package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YewudaibanEntity;
import com.entity.view.YewudaibanView;

import com.service.YewudaibanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 业务代办
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
@RestController
@RequestMapping("/yewudaiban")
public class YewudaibanController {
    @Autowired
    private YewudaibanService yewudaibanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YewudaibanEntity yewudaiban, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yewudaiban.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YewudaibanEntity> ew = new EntityWrapper<YewudaibanEntity>();
		PageUtils page = yewudaibanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yewudaiban), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YewudaibanEntity yewudaiban, HttpServletRequest request){
        EntityWrapper<YewudaibanEntity> ew = new EntityWrapper<YewudaibanEntity>();
		PageUtils page = yewudaibanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yewudaiban), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YewudaibanEntity yewudaiban){
       	EntityWrapper<YewudaibanEntity> ew = new EntityWrapper<YewudaibanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yewudaiban, "yewudaiban")); 
        return R.ok().put("data", yewudaibanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YewudaibanEntity yewudaiban){
        EntityWrapper< YewudaibanEntity> ew = new EntityWrapper< YewudaibanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yewudaiban, "yewudaiban")); 
		YewudaibanView yewudaibanView =  yewudaibanService.selectView(ew);
		return R.ok("查询业务代办成功").put("data", yewudaibanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        YewudaibanEntity yewudaiban = yewudaibanService.selectById(id);
        return R.ok().put("data", yewudaiban);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        YewudaibanEntity yewudaiban = yewudaibanService.selectById(id);
        return R.ok().put("data", yewudaiban);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YewudaibanEntity yewudaiban, HttpServletRequest request){
    	yewudaiban.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yewudaiban);

        yewudaibanService.insert(yewudaiban);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YewudaibanEntity yewudaiban, HttpServletRequest request){
    	yewudaiban.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yewudaiban);

        yewudaibanService.insert(yewudaiban);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YewudaibanEntity yewudaiban, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yewudaiban);
        yewudaibanService.updateById(yewudaiban);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yewudaibanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YewudaibanEntity> wrapper = new EntityWrapper<YewudaibanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = yewudaibanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
