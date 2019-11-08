package com.example.model;

public class SciFi {

	private int id;
	private String title;
	private boolean cheap;

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

	public boolean isCheap() {
		return cheap;
	}

	public void setCheap(boolean cheap) {
		this.cheap = cheap;
	}

	public SciFi(int id, String title, boolean cheap) {
		super();
		this.id = id;
		this.title = title;
		this.cheap = cheap;
	}

	public SciFi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SciFi [id=" + id + ", title=" + title + ", cheap=" + cheap + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (cheap ? 1231 : 1237);
		result = prime * result + id;
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
		SciFi other = (SciFi) obj;
		if (cheap != other.cheap)
			return false;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

}
