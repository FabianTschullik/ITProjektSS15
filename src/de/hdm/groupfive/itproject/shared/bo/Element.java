package de.hdm.groupfive.itproject.shared.bo;

import java.sql.Timestamp;

public class Element extends BusinessObject implements AdministrationCommon{
	private static final long serialVersionUID = 1L;

	private String name = "";
	private String description = "";
	private String materialDescription = "";
	private Timestamp creationDate;
	private Timestamp modifyDate;
	private User lastUser;

	/**
	 * Fremdschl�sselbeziehung zum Inhaber des Kontos.
	 */
	private int ownerID = 0;

	/**
	 * Auslesen des Fremdschl�ssels zum Kontoinhaber.
	 */

	public int getOwnerID() {
		return this.ownerID;
	}

	/**
	 * Setzen des Fremdschl�ssels zum Kontoinhaber.
	 */
	public void setOwnerID(int kundeID) {
		this.ownerID = kundeID;
	}

	/**
	 * Erzeugen einer einfachen textuellen Repr�sentation der jeweiligen
	 * Kontoinstanz.
	 */
	@Override
	public String toString() {
		return super.toString() + " inhaber, Kunden-ID: #" + this.ownerID;
	}

	/**
	 * <p>
	 * Feststellen der <em>inhaltlichen</em> Gleichheit zweier Account-Objekte.
	 * Die Gleichheit wird in diesem Beispiel auf eine identische Kontonummer
	 * beschr�nkt.
	 * </p>
	 * <p>
	 * <b>ACHTUNG:</b> Die inhaltliche Gleichheit nicht mit dem Vergleich der
	 * <em>Identit�t</em> eines Objekts mit einem anderen verwechseln!!! Dies
	 * w�rde durch den Operator <code>==</code> bestimmt. Bei Unklarheit hierzu
	 * k�nnen Sie nocheinmal in die Definition des Sprachkerns von Java schauen.
	 * Die Methode <code>equals(...)</code> ist f�r jeden Referenzdatentyp
	 * definiert, da sie bereits in der Klasse <code>Object</code> in
	 * einfachster Form realisiert ist. Dort ist sie allerdings auf die simple
	 * Bestimmung der Gleicheit der Java-internen Objekt-ID der verglichenen
	 * Objekte beschr�nkt. In unseren eigenen Klassen k�nnen wir diese Methode
	 * �berschreiben und ihr mehr Intelligenz verleihen.
	 * </p>
	 */
	@Override
	public boolean equals(Object o) {
		/*
		 * Abfragen, ob ein Objekt ungl. NULL ist und ob ein Objekt gecastet
		 * werden kann, sind immer wichtig!
		 */
		if (o != null && o instanceof Element) {
			Element c = (Element) o;
			try {
				return super.equals(c);
			} catch (IllegalArgumentException e) {
				return false;
			}
		}
		return false;
	}

	public void setNameID(String string) {
		// TODO Auto-generated method stub
		/**
		 * Setzen des Namens des Bauteils
		 */
		this.name = string;


	}

	public void setDescriptionID(String string) {
		// TODO Auto-generated method stub
		/**
		 * Setzen der Beschreibung des Bauteils
		 */
		this.description = string;

	}

	public void setMaterialDescriptionID(String string) {
		// TODO Auto-generated method stub
		/**
		 * Setzen der Materialbeschreibung des Bauteils
		 */
		this.materialDescription = string;

	}

	public void setModifyDateID(Timestamp timestamp) {
		// TODO Auto-generated method stub
		/**
		   * 
		   */
		this.modifyDate = timestamp;

	}

	public void setCreationDateID(Timestamp timestamp) {
		// TODO Auto-generated method stub
		this.creationDate = timestamp;
	}

	public void setUserID(User user) {
		// TODO Auto-generated method stub
		this.lastUser = user;

	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public String getMaterialdescription() {
		return this.materialDescription;
	}

	public Timestamp getCreationDate() {
		return this.creationDate;
	}

	public Timestamp getModifyDate() {
		return this.modifyDate;
	}

	public User getUser() {
		return this.lastUser;
	}

}
