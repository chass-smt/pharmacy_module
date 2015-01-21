/**
 * 
 */
package org.openmrs.module.pharmacy_module.api.dao.hibernate;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.openmrs.Drug;
import org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO;
import org.openmrs.module.pharmacy_module.api.model.DrugTransactions;
import org.openmrs.module.pharmacy_module.api.model.DrugsStore;
import org.openmrs.module.pharmacy_module.api.model.DrugsStoreIncoming;
import org.openmrs.module.pharmacy_module.api.model.DrugsStoreOutgoing;
import org.openmrs.module.pharmacy_module.api.model.PharmacyLocations;
import org.openmrs.module.pharmacy_module.api.model.PharmacyTransactionTypes;

/**
 * @author nhagumbex
 *
 */
public class HibernatePharmacyDAO implements PharmacyModuleDAO {

	
	 @SuppressWarnings("unused")
	    private static final Log log = LogFactory.getLog(HibernatePharmacyDAO.class);
	    private SessionFactory sessionFactory;

	    /**
	     * @return the sessionFactory
	     */
	    public SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }

	    /**
	     * @param sessionFactory the sessionFactory to set
	     */
	    public void setSessionFactory(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }
	
	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#saveDrugsStore(org.openmrs.module.pharmacy_module.api.model.DrugsStore)
	 */
	@Override
	public DrugsStore saveDrugsStore(DrugsStore drugsStore) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#getDrugsStores()
	 */
	@Override
	public List<DrugsStore> getDrugsStores() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#getDrugsStoresById(java.lang.Integer)
	 */
	@Override
	public List<DrugsStore> getDrugsStoresById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#getDrugsStoreByName(org.openmrs.Drug)
	 */
	@Override
	public List<DrugsStore> getDrugsStoreByName(Drug drug) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#saveDrugsStoreIncoming(org.openmrs.module.pharmacy_module.api.model.DrugsStoreIncoming)
	 */
	@Override
	public DrugsStoreIncoming saveDrugsStoreIncoming(
			DrugsStoreIncoming drugsStoreIncoming) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#getDrugsStoreIncomings()
	 */
	@Override
	public List<DrugsStoreIncoming> getDrugsStoreIncomings() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#getDrugsStoreIncomengByName(org.openmrs.Drug)
	 */
	@Override
	public List<DrugsStoreIncoming> getDrugsStoreIncomengByName(Drug drug) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#saveDrugsStoreOutgoing(org.openmrs.module.pharmacy_module.api.model.DrugsStoreOutgoing)
	 */
	@Override
	public DrugsStoreOutgoing saveDrugsStoreOutgoing(
			DrugsStoreOutgoing drugsStoreOutgoing) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#getDrugsStoreOutgoings()
	 */
	@Override
	public List<DrugsStoreOutgoing> getDrugsStoreOutgoings() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#getDrugsStoreOutgoings(org.openmrs.Drug)
	 */
	@Override
	public List<DrugsStoreOutgoing> getDrugsStoreOutgoings(Drug drug) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#saveDrugTransactions(org.openmrs.module.pharmacy_module.api.model.DrugTransactions)
	 */
	@Override
	public DrugTransactions saveDrugTransactions(
			DrugTransactions drugTransactions) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#getDrugTransactions()
	 */
	@Override
	public List<DrugTransactions> getDrugTransactions() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#savePharmacyLocations(org.openmrs.module.pharmacy_module.api.model.PharmacyLocations)
	 */
	@Override
	public PharmacyLocations savePharmacyLocations(
			PharmacyLocations pharmacyLocations) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#getPharmacyLocations()
	 */
	@Override
	public List<PharmacyLocations> getPharmacyLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#savePharmacyTransactionTypes()
	 */
	@Override
	public PharmacyTransactionTypes savePharmacyTransactionTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#getPharmacyTransactionTypes()
	 */
	@Override
	public List<PharmacyTransactionTypes> getPharmacyTransactionTypes() {
		// TODO Auto-generated method stub
		return null;
	}

}
