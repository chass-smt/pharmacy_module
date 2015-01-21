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
package org.openmrs.module.pharmacy_module.api.service.impl;

import java.util.List;

import org.openmrs.Drug;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.pharmacy_module.api.dao.PharmacyModuleDAO;
import org.openmrs.module.pharmacy_module.api.model.DrugTransactions;
import org.openmrs.module.pharmacy_module.api.model.DrugsStore;
import org.openmrs.module.pharmacy_module.api.model.DrugsStoreIncoming;
import org.openmrs.module.pharmacy_module.api.model.DrugsStoreOutgoing;
import org.openmrs.module.pharmacy_module.api.model.PharmacyLocations;
import org.openmrs.module.pharmacy_module.api.model.PharmacyTransactionTypes;
import org.openmrs.module.pharmacy_module.api.service.OpenMRSpharmacymoduleService;

/**
 * It is a default implementation of {@link OpenMRSpharmacymoduleService}.
 */
public class OpenMRSpharmacymoduleServiceImpl extends BaseOpenmrsService implements OpenMRSpharmacymoduleService {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private PharmacyModuleDAO dao;
	
	
	/**
	 * @return the dao
	 */
	public PharmacyModuleDAO getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(PharmacyModuleDAO dao) {
		this.dao = dao;
	}

	@Override
	public DrugsStore saveDrugsStore(DrugsStore drugsStore) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DrugsStore> getDrugsStore() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DrugsStoreIncoming saveDrugsStoreIncoming(
			DrugsStoreIncoming drugsStoreIncoming) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DrugsStoreIncoming> getDrugsStoreIncomings(
			DrugsStoreIncoming drugsStoreIncoming) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DrugsStoreOutgoing saveDRuDrugsStoreOutgoing(
			DrugsStoreOutgoing drugsStoreOutgoing) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DrugsStoreOutgoing> getDrugsStoreOutgoings(
			DrugsStoreOutgoing drugsStoreOutgoing) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DrugsStoreIncoming> getDrugsStoreIncomengByName(Drug drug) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DrugTransactions saveDrugTransactions(
			DrugTransactions drugTransactions) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DrugTransactions> getDrugTransactions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PharmacyLocations savePharmacyLocations(
			PharmacyLocations pharmacyLocations) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PharmacyTransactionTypes getPharmacyTransactionTypesByUuid(
			String uuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PharmacyTransactionTypes getPharmacyTransactionTypesByName(
			String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PharmacyLocations> getPharmacyLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PharmacyTransactionTypes savePharmacyTransactionTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PharmacyTransactionTypes> getPharmacyTransactionTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DrugsStoreIncoming getPharmacyStoreIncomingByUuid(String uuid) {
		// TODO Auto-generated method stub
		return null;
	}
}