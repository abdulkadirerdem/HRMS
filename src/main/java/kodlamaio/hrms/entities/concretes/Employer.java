package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@Table(name="employers")
public class Employer extends User {

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "web_address")
	private String webAdress;

	@Column(name = "phone_number")
	private String telefonNumber;
	
	@OneToMany(mappedBy = "employer")
	private List<JobAdvert> jobAdverts;
}
