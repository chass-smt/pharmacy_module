/**
 * 
 */
package org.openmrs.module.pharmacy_module.api.model;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Drug;

/**
 * @author Xavier Francsico
 *
 */
public class DrugsStoreOutgoing extends BaseOpenmrsData {

	private Integer id;

    private Drug drug;

    private Integer quantityIn;	
	
    private PharmacyLocations location;
    
    private PharmacyTransactionTypes transaction;
    
    

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
	public DrugsStoreOutgoing() {
	}

	/**
	 * @return the drug
	 */
	public Drug getDrug() {
		return drug;
	}

	/**
	 * @param drug the drug to set
	 */
	public void setDrug(Drug drug) {
		this.drug = drug;
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
	
	

}
