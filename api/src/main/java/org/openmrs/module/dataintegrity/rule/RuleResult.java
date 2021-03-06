/*
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 *
 */

package org.openmrs.module.dataintegrity.rule;

public class RuleResult<T> {
	
	private T entity;
	
	private String notes;
	
	private String actionUrl;
	
	public T getEntity() {
		return entity;
	}
	
	public void setEntity(T entity) {
		this.entity = entity;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public String getActionUrl() {
		return actionUrl;
	}
	
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}
}
