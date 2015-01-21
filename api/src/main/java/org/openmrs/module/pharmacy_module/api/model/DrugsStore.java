/**
 * 
 */
package org.openmrs.module.pharmacy_module.api.model;

import java.util.Date;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Drug;

/**
 * @author Xavier Francisco
 *
 */
public class DrugsStore extends BaseOpenmrsData {
	
	private Integer id;

    private Drug drugs;

    private Integer quantity;

    private Integer quantityIn;

    private Integer quantityOut;
    
    private Integer positiveAdjastement;
    
    private Integer negativeAdjastement;
    
    private Date expireDate;
    
    
    

	/**
	 * 
	 */
	public DrugsStore() {
		
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Integer arg0) {
		// TODO Auto-generated method stub
		
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
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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
	 * @return the positiveAdjastement
	 */
	public Integer getPositiveAdjastement() {
		return positiveAdjastement;
	}

	/**
	 * @param positiveAdjastement the positiveAdjastement to set
	 */
	public void setPositiveAdjastement(Integer positiveAdjastement) {
		this.positiveAdjastement = positiveAdjastement;
	}

	/**
	 * @return the negativeAdjastement
	 */
	public Integer getNegativeAdjastement() {
		return negativeAdjastement;
	}

	/**
	 * @param negativeAdjastement the negativeAdjastement to set
	 */
	public void setNegativeAdjastement(Integer negativeAdjastement) {
		this.negativeAdjastement = negativeAdjastement;
	}

	/**
	 * @return the expireDate
	 */
	public Date getExpireDate() {
		return expireDate;
	}

	/**
	 * @param expireDate the expireDate to set
	 */
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	
	
	
	

}
