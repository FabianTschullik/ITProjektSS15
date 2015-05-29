package de.hdm.groupfive.itproject.shared.bo;

import java.util.ArrayList;
import java.util.Date;

public class Partlist extends BusinessObject {

	/**
	 * Eindeutige SerialVersion Id. Wird zum Serialisieren der Klasse ben�tigt.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Das Erstelldatum
	 */
	private Date creationDate;
	
	/**
	 * Name der St�ckliste
	 */
	private String name;
	
	/**
	 * Der Prim�rschl�ssel der St�ckliste
	 */
	private int id;
	
	/**
	 * Attribut in dem die St�ckliste gespeichert wird. 
	 */
	private ArrayList<PartlistEntry> list;

	/**
	 * Dieser Konstruktor erm�glicht es, bereits bei Instantiierung von <code>Partlist</code>-Objekten eine ArrayList mit dem Datentyp von <code>PartlistEntry</code> anzulegen.
	 * @see #Partlist()
	 */
	public Partlist() {
		this.list = new ArrayList<PartlistEntry>();
	}

	/**
	 * Hinzuf�gen von Bauteilen zu der St�ckliste
	 * 
	 * @param element
	 *            Bauteil das hinmzugef�gt werden soll
	 * @param amount
	 *            Anzahl der Bauteile die hinzugef�gt werden sollen
	 */
	public void add(Element element, int amount) {
		if (element != null && amount > 0) {
			list.add(new PartlistEntry(element, amount));
		}
	}

	/**
	 * Berbeitet Bauteil aus der St�ckliste
	 * 
	 * @param element
	 *            Bauteil das bearbeitet werden soll
	 */
	public void edit(Element element) {
		for (PartlistEntry entry : list) {
			if (entry.getElement().getId() == element.getId()) {
				entry.setElement(element);
				break;
			}
		}

	}

	/**
	 * L�scht Bauteil aus der St�ckliste
	 * 
	 * @param element
	 *            Bauteil das gel�scht werden soll.
	 */
	public void delete(Element element) {
		for (PartlistEntry entry : list) {
			if (entry.getElement().getId() == element.getId()) {
				list.remove(entry);
				break;
			}
		}
	}

	/**
	 * L�scht Bauteil anhand der Element Id aus der St�ckliste
	 * 
	 * @param elementId
	 *            Id des Bauteils das gel�scht werden soll.
	 */
	public void deleteById(int elementId) {
		for (PartlistEntry entry : list) {
			if (entry.getElement().getId() == elementId) {
				list.remove(entry);
				break;
			}
		}

	}

	/**
	 * Auslesen des Bauteils anhand der Element ID aus der St�ckliste.
	 * 
	 * @param elementId
	 *            ID des Bauteils das ausgelesen werden soll.
	 * @return Das Bauteil <code>Element</code> wird zur�ckgegeben
	 */
	// WIE GIBT MAN EIN ATTRIBUT AUS EINER ANDEREN KLASSE IN EINER BESCHREIUBUNG AN?
	public Element getElementById(int elementId) {
		Element result = null;
		for (PartlistEntry entry : list) {
			if (entry.getElement().getId() == elementId) {
				result = entry.getElement();
				break;
			}
		}
		return result;
	}

	/**
	 * Auslesen der ID
	 */
	public int getId() {
		return this.id;

	}

	/**
	 * Auslesen der Erstellungsdatums
	 * @return 
	 */
	public Date getCreationDate() {
		return this.creationDate;
	}
	/**
	 * Auslesen der Anzahl anhand des Bauteils <code>element</code> aus der St�ckliste.
	 * 
	 * @param element
	 *            Bauteil <code>element</code> dessen Anzahl ausgelesen werden soll.
	 * @return Die Anzahl <code>amount</code> wird zur�ckgegeben
	 */
	public int getAmountByElement(Element element) {
		int result = 0;
		for (PartlistEntry entry : list) {
			if (entry.getElement() == element) {
				result = entry.getAmount();
				break;
			}
		}
		return result;

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		throw new UnsupportedOperationException("Not yet implemented");

	}

}

class PartlistEntry {

	private Element element;
	private int amount;

	public PartlistEntry(Element element, int amount) {
		this.element = element;
		this.amount = amount;
	}

	public Element getElement() {
		return element;
	}

	public void setElement(Element element) {
		this.element = element;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
