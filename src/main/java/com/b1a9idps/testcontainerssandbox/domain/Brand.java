package com.b1a9idps.testcontainerssandbox.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Brand implements Serializable {
	public enum Gender {
		MAN, WOMAN
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String designer;

	@Enumerated(EnumType.STRING)
	private Gender gender;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesigner() {
		return designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
}
