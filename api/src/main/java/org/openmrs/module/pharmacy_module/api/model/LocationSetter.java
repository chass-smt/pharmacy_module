/**
 * 
 */
package org.openmrs.module.pharmacy_module.api.model;

/**
 * @author Xavier Francisco
 *
 */
public class LocationSetter {
	
	private Integer id;
	
	private String name = "none";

	/**
	 * 
	 */
	public LocationSetter() {
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	
	
	/**
	 * @param name
	 * @return 
	 */
	public Boolean setName(String name){
		
		this.name = name;
		return true;
		
	}

}
