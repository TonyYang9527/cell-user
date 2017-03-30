package com.cell.user.utils;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

public class String2Set {

	public static Set<Long> toSet(String valueStr) {

		if (StringUtils.isEmpty(valueStr)) {
			return new HashSet<Long>();
		}
		String[] values = StringUtils.split(valueStr, ",");
		Set<Long> result = new HashSet<Long>();
		for (String value : values) {
			if (StringUtils.isNotEmpty(value)) {
				result.add(new Long(value));
			}
		}
		return result;
	}

}
