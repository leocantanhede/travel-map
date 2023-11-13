package pt.lunasoft.map.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.Field.Write;

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
@Document(collection = "ADDRESS")
public class Address implements Serializable {

	private static final long serialVersionUID = 3610941298563119286L;
	
	@Id
	@Field(name = "ID")
	private String id;
	
	@Field(name = "STREET")
	private String street;
	
	@Field(name = "NUMBER")
	private Integer number;
	
	@Field(name = "COMPLEMENT", write = Write.ALWAYS)
	private String complement;
	
	@Field(name = "NEIGHBOURHOOD")
	private String neighbourhood;
	
	@Field(name = "CITY")
	private String city;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [id=");
		builder.append(id);
		builder.append(", street=");
		builder.append(street);
		builder.append(", number=");
		builder.append(number);
		builder.append(", complement=");
		builder.append(complement);
		builder.append(", neighbourhood=");
		builder.append(neighbourhood);
		builder.append(", city=");
		builder.append(city);
		builder.append("]");
		return builder.toString();
	}
	
}