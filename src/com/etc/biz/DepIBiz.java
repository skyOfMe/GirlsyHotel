package com.etc.biz;

import java.util.List;

import com.etc.bean.Dep;
import com.etc.bean.Ord;

public interface DepIBiz {
		//获取所有部门信息
		public List<Dep> getAllDep();
		//修改或增加部门信息
		public void updateOrAddDep(Dep s);
		//删除部门
		public void deleteDep(int id);
		//根据ID获取部门信息,
		
		public Dep getDepById(int id);
}
