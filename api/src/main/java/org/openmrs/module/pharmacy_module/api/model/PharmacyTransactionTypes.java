/**
 * 
 */
package org.openmrs.module.pharmacy_module.api.model;

import org.openmrs.BaseOpenmrsData;

/**
 * @author Xavier Francisco
 *
 */
public class PharmacyTransactionTypes extends BaseOpenmrsData {
 
	 private Integer id;
	 
	 private String name;
	 
	 private String description;
	 
	 
	 	
	/**
	 * Construtor
	 */
	public PharmacyTransactionTypes() {
	}
	
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}



	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}



	/* (non-Javadoc)
	 * @see org.openmrs.OpenmrsObject#getId()
	 */
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.OpenmrsObject#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer arg0) {
		// TODO Auto-generated method stub

	}

}
