//domain model

package com.silvia.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="languages")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@NotNull
	@Size(min = 2, max = 20)
	private String name;
	
	@NotNull
	@Size(min = 2, max = 20)
	private String creator;
	
	@NotNull
	@Size(min = 1)
	private String version;

	private Date updatedAt;

	private Date createdAt;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCreator() {
		return creator;
	}

	public String getVersion() {
		return version;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	//constructors
	public Language(String name, String creator, String version) {
		this.name = name;
		this.creator = creator;
		this.version = version;
	}
	
	public Language() {}
	
	@PrePersist
    protected void onCreate(){
        this.setCreatedAt(new Date());
    }
    @PreUpdate
    protected void onUpdate(){
        this.setUpdatedAt(new Date());
    }

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
