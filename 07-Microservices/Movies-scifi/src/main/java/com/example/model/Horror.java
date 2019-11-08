package com.example.model;

public class Horror {
	private int id;
	private String title;
	private int rating;

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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Horror(int id, String title, int rating) {
		super();
		this.id = id;
		this.title = title;
		this.rating = rating;
	}

	public Horror() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Horror [id=" + id + ", title=" + title + ", rating=" + rating + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + rating;
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
		Horror other = (Horror) obj;
		if (id != other.id)
			return false;
		if (rating != other.rating)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

 }
