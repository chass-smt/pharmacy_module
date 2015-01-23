/**
 * 
 */
package org.openmrs.module.pharmacy_module.api.dao.hibernate;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Drug;
import org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO;
import org.openmrs.module.pharmacy_module.api.model.DrugTransactions;
import org.openmrs.module.pharmacy_module.api.model.DrugsStore;
import org.openmrs.module.pharmacy_module.api.model.DrugsStoreIncoming;
import org.openmrs.module.pharmacy_module.api.model.DrugsStoreOutgoing;
import org.openmrs.module.pharmacy_module.api.model.LocationSetter;
import org.openmrs.module.pharmacy_module.api.model.PharmacyLocations;
import org.openmrs.module.pharmacy_module.api.model.PharmacyTransactionTypes;
//import org.openmrs.module.pharmacy_module.api.model.PharmacyTransactionTypes;

/**
 * @author nhagumbex
 *
 */
public class HibernatePharmacyDAO implements PharmacyModuleDAO {

	
	 @SuppressWarnings("unused")
	    private static final Log log = LogFactory.getLog(HibernatePharmacyDAO.class);
	    private LocationSetter loc = new LocationSetter();
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
		sessionFactory.getCurrentSession().saveOrUpdate(drugsStore);

		return drugsStore;
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#getDrugsStores()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<DrugsStore> getDrugsStores() {
	   Criteria criteria = sessionFactory.getCurrentSession().createCriteria(DrugsStore.class)
                .add(Restrictions.eq("voided", false));

        return criteria.list();
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO#getDrugsStoresById(java.lang.Integer)
	 */
	@Override
	public List<DrugsStore> getDrugsStoresById(Integer id) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(DrugsStore.class)
				.add(Restrictions.eq("id", id));
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

	

	@Override
	public DrugsStoreIncoming getDrugStoreIncomingByUuid(String uuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DrugsStoreOutgoing getDrugStoreOutgoingByUuid(String uuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DrugsStore saveInventory(DrugsStore drugsStore) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveInventory(List drugsStores) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List getInventory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DrugsStore getInventoryByUuid(String uuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DrugsStore> getInventoryListByUuid(String uuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DrugsStore getInventoryByDrugUuid(Drug uuid, String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DrugsStore> getDrugsStoreByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
