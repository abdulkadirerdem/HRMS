package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employers")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Employer extends User {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "campany_name")
	private String campanyName;

	@Column(name = "web_site")
	private String webSite;

	@Column(name = "phone_number")
	private String phoneNumber;

}