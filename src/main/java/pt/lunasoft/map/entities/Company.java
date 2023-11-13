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
@Document(collection = "COMPANY")
public class Company implements Serializable {

	private static final long serialVersionUID = 8541443206000348666L;
	
	@Id
	@Field(name = "ID")
	private String id;
	
	@Field(name = "NAME")
	private String name;
	
	@DocumentReference(collection = "ADDRESS")
	@Field(name = "ADDRESS")
	private Address address;
	
	@Field(name = "VAT_NUMBER")
	private Long vatNumber;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Company [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", vatNumber=");
		builder.append(vatNumber);
		builder.append("]");
		return builder.toString();
	}
	
}