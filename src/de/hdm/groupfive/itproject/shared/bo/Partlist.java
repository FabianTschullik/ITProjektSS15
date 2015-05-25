package de.hdm.groupfive.itproject.shared.bo;

import java.util.ArrayList;
import java.util.Date;

public class Partlist extends BusinessObject {

	/**
	 * Eindeutige SerialVersion Id. Wird zum Serialisieren der Klasse ben�tigt.
	 */
	private static final long serialVersionUID = 1L;

	private Date creationDate;
	private String name;
	private int id;
	private ArrayList<PartlistEntry> list;

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

	public Element getElementById(int elementId) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public int getId() {

		throw new UnsupportedOperationException("Not yet implemented");

	}

	public Date getCreationDate() {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public int getAmountByElement(Element element) {
		throw new UnsupportedOperationException("Not yet implemented");

	}

	public String getName() {
		throw new UnsupportedOperationException("Not yet implemented");
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
