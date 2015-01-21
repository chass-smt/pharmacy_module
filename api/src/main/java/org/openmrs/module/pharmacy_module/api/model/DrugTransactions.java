/**
 * 
 */
package org.openmrs.module.pharmacy_module.api.model;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Drug;

/**
 * @author Xavier Francisco
 *
 */
public class DrugTransactions extends BaseOpenmrsData {
	
	private Integer id;

    private Drug drugs;

    private Integer quantityIn;

    private Integer quantityOut;

    private String comment;

    private String location;

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

	/**
	 * 
	 */
	public DrugTransactions() {
	}

	/**
	 * @return the drugs
	 */
	public Drug getDrugs() {
		return drugs;
	}

	/**
	 * @param drugs the drugs to set
	 */
	public void setDrugs(Drug drugs) {
		this.drugs = drugs;
	}

	/**
	 * @return the quantityIn
	 */
	public Integer getQuantityIn() {
		return quantityIn;
	}

	/**
	 * @param quantityIn the quantityIn to set
	 */
	public void setQuantityIn(Integer quantityIn) {
		this.quantityIn = quantityIn;
	}

	/**
	 * @return the quantityOut
	 */
	public Integer getQuantityOut() {
		return quantityOut;
	}

	/**
	 * @param quantityOut the quantityOut to set
	 */
	public void setQuantityOut(Integer quantityOut) {
		this.quantityOut = quantityOut;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
