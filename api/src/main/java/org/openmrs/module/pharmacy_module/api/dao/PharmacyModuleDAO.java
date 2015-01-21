/**
 * 
 */
package org.openmrs.module.pharmacy_module.api.dao;

import java.util.List;

import org.openmrs.Drug;
import org.openmrs.module.pharmacy_module.api.model.DrugTransactions;
import org.openmrs.module.pharmacy_module.api.model.DrugsStore;
import org.openmrs.module.pharmacy_module.api.model.DrugsStoreIncoming;
import org.openmrs.module.pharmacy_module.api.model.DrugsStoreOutgoing;
import org.openmrs.module.pharmacy_module.api.model.PharmacyLocations;
import org.openmrs.module.pharmacy_module.api.model.PharmacyTransactionTypes;

/**
 * @author Xavier Francisco
 *
 */

public interface PharmacyModuleDAO {
	
	
	
	/**
	 * @param drugsStore
	 * @return saved drugsStore
	 */
	public DrugsStore saveDrugsStore (DrugsStore drugsStore);
	
	/**
	 * @return altl the DrugsStore
	 */
	public List<DrugsStore> getDrugsStores();
	
	/**
	 * @param id
	 * @return
	 */
	public List<DrugsStore> getDrugsStoresById(Integer id);
	
	public List<DrugsStore> getDrugsStoreByName(Drug drug);
	
	/**
	 * @param drugsStoreIncoming
	 * @return saved drugsStoreIncoming
	 */
	public DrugsStoreIncoming saveDrugsStoreIncoming(DrugsStoreIncoming drugsStoreIncoming);
	
	
	/**
	 * @return all DrugsStoreIncoming
	 */
	public List<DrugsStoreIncoming> getDrugsStoreIncomings();
	
	/**
	 * @param drug
	 * @return
	 */
	public List<DrugsStoreIncoming> getDrugsStoreIncomengByName(Drug drug);
	
	
	/**
	 * @param drugsStoreOutgoing
	 * @return saved DrugsStoreOutgoing
	 */
	public DrugsStoreOutgoing saveDrugsStoreOutgoing(DrugsStoreOutgoing drugsStoreOutgoing);
	
	
	/**
	 * @return all DrugsStoreOutgoing
	 */
	public List<DrugsStoreOutgoing> getDrugsStoreOutgoings();
	
	/**
	 * @param drug
	 * @return
	 */
	public List<DrugsStoreOutgoing> getDrugsStoreOutgoings(Drug drug);
	
		
	/**
	 * @param drugTransactions
	 * @return
	 */
	public DrugTransactions saveDrugTransactions(DrugTransactions drugTransactions);
	
	
	/**
	 * @return
	 */
	public List<DrugTransactions> getDrugTransactions();
	
	/**
	 * @param pharmacyLocations
	 * @return
	 */
	public PharmacyLocations savePharmacyLocations(PharmacyLocations pharmacyLocations);
	
	/**
	 * @return
	 */
	public List<PharmacyLocations> getPharmacyLocations();
	
	/**
	 * @return
	 */
	public PharmacyTransactionTypes savePharmacyTransactionTypes();
	
	/**
	 * @return
	 */
	public List<PharmacyTransactionTypes> getPharmacyTransactionTypes();

}
