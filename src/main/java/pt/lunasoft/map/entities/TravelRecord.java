package pt.lunasoft.map.entities;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
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
@Document(collection = "TRAVEL_RECORD")
public class TravelRecord implements Serializable {

	private static final long serialVersionUID = 5960337898920191444L;
	
	@Id
	@Field(name = "ID")
	private String id;
	
	@DocumentReference(collection = "EMPLOYEE")
	@Field(name = "EMPLOYEE")
	private Employee employee;
	
	@Field(name = "DATE")
	private LocalDate date;
	
	@Field(name = "ORIGIN")
	private String origin;
	
	@Field(name = "DESTINATION")
	private String destination;
	
	@Field(name = "JUSTIFICATION", write = Write.ALWAYS)
	private String justification;
	
	@Field(name = "KILOMETRES")
	private Double kilometres;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TravelRecord [id=");
		builder.append(id);
		builder.append(", employee=");
		builder.append(employee);
		builder.append(", date=");
		builder.append(date);
		builder.append(", origin=");
		builder.append(origin);
		builder.append(", destination=");
		builder.append(destination);
		builder.append(", justification=");
		builder.append(justification);
		builder.append(", kilometres=");
		builder.append(kilometres);
		builder.append("]");
		return builder.toString();
	}
	
}