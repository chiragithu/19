package in.chira.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="insurence")
public class Insurence {
	@Id
	@Column(name="ins-id")
	private String id;
	@Column(name="ins-name")
	private String name;
	@Column(name="ins-price")
	private Double price;
	@CreationTimestamp
	@Column(updatable=false)
	private LocalDate createtime;
	@UpdateTimestamp
	@Column(insertable=false)
	private LocalDate updatetime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public LocalDate getCreatetime() {
		return createtime;
	}
	public void setCreatetime(LocalDate createtime) {
		this.createtime = createtime;
	}
	public LocalDate getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(LocalDate updatetime) {
		this.updatetime = updatetime;
	}
	@Override
	public String toString() {
		return "Insurence [id=" + id + ", name=" + name + ", price=" + price + ", createtime=" + createtime
				+ ", updatetime=" + updatetime + "]";
	}
	
	
}
