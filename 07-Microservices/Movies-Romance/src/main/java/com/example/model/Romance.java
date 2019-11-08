package com.example.model;

public class Romance {

	private int id;
	private String title;
	private boolean sappy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isSappy() {
		return sappy;
	}

	public void setSappy(boolean sappy) {
		this.sappy = sappy;
	}

	public Romance(int id, String title, boolean sappy) {
		super();
		this.id = id;
		this.title = title;
		this.sappy = sappy;
	}

	public Romance() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Romance [id=" + id + ", title=" + title + ", sappy=" + sappy + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + (sappy ? 1231 : 1237);
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Romance other = (Romance) obj;
		if (id != other.id)
			return false;
		if (sappy != other.sappy)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

}
