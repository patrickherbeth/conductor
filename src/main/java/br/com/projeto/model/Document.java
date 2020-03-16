package br.com.projeto.model;

import org.springframework.data.annotation.Id;

public class Document {

	@Id
	private String id;
	private String data;
	private int identification;
	private String name;
	private String state;
	private int value;
	private String low;
	
	public Document(String id) {
		super();
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
 	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @return
	 */
	public int getIdentification() {
		return identification;
	}

	/**
	 * @param identification
	 */
	public void setIdentification(int identification) {
		this.identification = identification;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return
	 */
	public int getValue() {
		return this.value;
	}

	/**
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return
	 */
	public String getLOW() {
		return this.low;
	}

	/**
	 * @param lOW
	 */
	public void setLOW(String low) {
		this.low = low;
	}

	@Override
	public String toString() {

		return String.format("Document[id= " + this.id + "| data=" + this.identification + "| identification="
				+ this.identification + "| name=" + this.name + "| state=" + this.state + "| value=" + this.value
				+ " | low=" + this.low + "]");
	}

}
