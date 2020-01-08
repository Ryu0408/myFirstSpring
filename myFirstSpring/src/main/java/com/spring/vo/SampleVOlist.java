package com.spring.vo;

import java.util.ArrayList;
import java.util.List;

public class SampleVOlist {
	private List<SampleVO> list;
	
	public SampleVOlist() {
		list = new ArrayList<>();
	}

	public List<SampleVO> getList() {
		return list;
	}

	public void setList(List<SampleVO> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "SampleVOlist [list=" + list + "]";
	}
}
