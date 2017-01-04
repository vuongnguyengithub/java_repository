package com.java_ee_sample.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseEntity {
	
	private static final String ADMINISTRATOR = "ADMINISTRATOR";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="create_date")
	private Date createDate;
	@Column(name="update_date")
	private Date updateDate;
	@Column(name="update_by")
	private String updateBy;
	@Column(name="create_by")
	private String createBy;
	
	public long getId() {
		return this.id;
	}
	
	public Date getCreateDate() {
		return this.createDate;
	}
	
	public Date getUpdateDate(){
		return this.updateDate;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		if(createBy == null || createBy.isEmpty()) {
			this.updateBy = ADMINISTRATOR;
		}
		this.createBy = createBy;
	}
	
	public void setUpdateBy(String updateBy) {
		if(updateBy == null || updateBy.isEmpty()) {
			this.updateBy = ADMINISTRATOR;
		}
		this. updateBy = updateBy;
	}
	
	
}
