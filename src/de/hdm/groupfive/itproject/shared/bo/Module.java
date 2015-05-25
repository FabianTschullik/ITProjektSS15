package de.hdm.groupfive.itproject.shared.bo;

public class Module extends Element {
	
	/**
	 * Eindeutige SerialVersion Id. Wird zum Serialisieren der Klasse ben�tigt.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Attribut partlist als St�ckliste der Baugruppe 
	 */
	private Partlist partlist;

	/**
	 * Konstruktor der Klasse Module (Baugruppe). Initialisiert eine neue St�ckliste.
	 */
	public Module() {
		this.partlist = new Partlist();
	}
	
	/**
	 * Liefert St�ckliste der Baugruppe
	 * @return St�ckliste der Baugruppe
	 */
	public Partlist getPartlist() {
		return this.partlist;
	}
}
