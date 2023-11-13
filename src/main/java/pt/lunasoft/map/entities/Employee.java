package pt.lunasoft.map.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Document(collection = "EMPLOYEE")
public class Employee implements Serializable {

	private static final long serialVersionUID = -6432945648270360085L;
	
	@Id
	@Field(name = "ID")
	private String id;
	
	@DocumentReference(collection = "COMPANY")
	@Field(name = "COMPANY")
	private Company company;
	
	@Field(name = "NAME")
	private String name;
	
	@Field(name = "TAX_NUMBER")
	private Long taxNumber;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", company=");
		builder.append(company);
		builder.append(", name=");
		builder.append(name);
		builder.append(", taxNumber=");
		builder.append(taxNumber);
		builder.append("]");
		return builder.toString();
	}
	
}