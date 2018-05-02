/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.commonlabtest;

import org.openmrs.BaseOpenmrsMetadata;
import org.openmrs.Concept;

/**
 * @author owais.hussain@ihsinformatics.com
 */
public class LabTestType extends BaseOpenmrsMetadata {
	
	private Integer labTestTypeId;
	
	private String shortName;
	
	private LabTestGroup testGroup;
	
	private Boolean requiresSpecimen;
	
	private Concept referenceConcept;
	
	/**
	 * Default constructor
	 */
	public LabTestType() {
	}
	
	/**
	 * @param id
	 */
	public LabTestType(Integer id) {
		this.labTestTypeId = id;
	}
	
	@Override
	public Integer getId() {
		return labTestTypeId;
	}
	
	@Override
	public void setId(Integer id) {
		this.labTestTypeId = id;
	}
	
	public String getShortName() {
		return shortName;
	}
	
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	public LabTestGroup getTestGroup() {
		return testGroup;
	}
	
	public void setTestGroup(LabTestGroup testGroup) {
		this.testGroup = testGroup;
	}
	
	public Boolean getRequiresSpecimen() {
		return requiresSpecimen;
	}
	
	public void setRequiresSpecimen(Boolean requiresSpecimen) {
		this.requiresSpecimen = requiresSpecimen;
	}
	
	public Concept getReferenceConcept() {
		return referenceConcept;
	}
	
	public void setReferenceConcept(Concept referenceConcept) {
		this.referenceConcept = referenceConcept;
	}
	
}
