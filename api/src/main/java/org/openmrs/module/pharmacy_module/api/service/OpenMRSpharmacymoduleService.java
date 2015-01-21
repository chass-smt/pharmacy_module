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
package org.openmrs.module.pharmacy_module.api.service;

import java.util.List;

import org.openmrs.Drug;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharmacy_module.api.model.DrugTransactions;
import org.openmrs.module.pharmacy_module.api.model.DrugsStore;
import org.openmrs.module.pharmacy_module.api.model.DrugsStoreIncoming;
import org.openmrs.module.pharmacy_module.api.model.DrugsStoreOutgoing;
import org.openmrs.module.pharmacy_module.api.model.PharmacyLocations;
import org.openmrs.module.pharmacy_module.api.model.PharmacyTransactionTypes;
import org.springframework.transaction.annotation.Transactional;

/**
 * This service exposes module's core functionality. It is a Spring managed bean which is configured in moduleApplicationContext.xml.
 * <p>
 * It can be accessed only via Context:<br>
 * <code>
 * Context.getService(OpenMRSpharmacymoduleService.class).someMethod();
 * </code>
 * 
 * @see org.openmrs.api.context.Context
 */
@Transactional
public interface OpenMRSpharmacymoduleService extends OpenmrsService {
     
	public DrugsStore saveDrugsStore(DrugsStore drugsStore);
	
	@Transactional(readOnly=true)
	public List<DrugsStore> getDrugsStore();
	
	public DrugsStoreIncoming saveDrugsStoreIncoming(DrugsStoreIncoming drugsStoreIncoming);
	
	@Transactional(readOnly=true)
	public List<DrugsStoreIncoming> getDrugsStoreIncomings(DrugsStoreIncoming drugsStoreIncoming);
	
	public DrugsStoreOutgoing saveDRuDrugsStoreOutgoing(DrugsStoreOutgoing drugsStoreOutgoing);
	
	@Transactional(readOnly=true)
	public List<DrugsStoreOutgoing> getDrugsStoreOutgoings(DrugsStoreOutgoing drugsStoreOutgoing);
	
	@Transactional(readOnly=true)
	public List<DrugsStoreIncoming> getDrugsStoreIncomengByName(Drug drug);
	
	public DrugTransactions saveDrugTransactions(DrugTransactions drugTransactions);
	
	@Transactional(readOnly=true)
	public List<DrugTransactions> getDrugTransactions();
	
	public PharmacyLocations savePharmacyLocations(PharmacyLocations pharmacyLocations);
	
	@Transactional(readOnly=true)
    public PharmacyTransactionTypes getPharmacyTransactionTypesByUuid(String uuid);

    @Transactional(readOnly=true)
    public PharmacyTransactionTypes getPharmacyTransactionTypesByName(String name);

	
	@Transactional(readOnly=true)
	public List<PharmacyLocations> getPharmacyLocations();
	
	public PharmacyTransactionTypes savePharmacyTransactionTypes();
	
	@Transactional(readOnly=true)
	public List<PharmacyTransactionTypes> getPharmacyTransactionTypes();
	
	@Transactional(readOnly=true)
	public DrugsStoreIncoming getPharmacyStoreIncomingByUuid(String uuid);
	
	
	
	
}