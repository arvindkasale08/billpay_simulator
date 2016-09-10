package com.causecode.utils;

import java.util.Date;

public interface Audited {
		    public Date getCreatedDate();
		    public void setCreatedDate(Date createdDate);
		    public Date getUpdatedDate();
		    public void setUpdatedDate(Date updatedDate);
}
