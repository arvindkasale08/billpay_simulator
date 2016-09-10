package com.causecode.utils;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;

import org.apache.commons.lang.ArrayUtils;
import org.apache.log4j.Logger;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import com.causecode.controllers.StoresController;

public class AuditInterceptor extends EmptyInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(StoresController.class);
	

	public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState,
			String[] propertyNames, Type[] types) {
		if (entity instanceof Audited) {
			int indexOf = ArrayUtils.indexOf(propertyNames, "updatedDate");
			currentState[indexOf] = new Timestamp(Calendar.getInstance().getTime().getTime());
			logger.debug("on update of Timestamped entity");
			return true;
		}
		logger.debug("on update of normal entity");
		return true;
	}

	public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		if (entity instanceof Audited) {
			int indexOf = ArrayUtils.indexOf(propertyNames, "createdDate");
			int indexOfUp = ArrayUtils.indexOf(propertyNames, "updatedDate");
			state[indexOf] = new Timestamp(Calendar.getInstance().getTime().getTime());
			state[indexOfUp] = new Timestamp(Calendar.getInstance().getTime().getTime());
			logger.debug("on save of Timestamped entity");
			return true;
		}
		logger.debug("on save of normal entity");
		return true;
	}
}
