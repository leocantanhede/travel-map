package pt.lunasoft.map.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
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
@Document(collection = "KILOMETRE_VALUE")
public class KilometreValue implements Serializable {

	private static final long serialVersionUID = 1560190219615216042L;
	
	@Id
	@Field(name = "ID")
	private String id;
	
	@Field(name = "VALUE")
	private BigDecimal value;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KilometreValue [id=");
		builder.append(id);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}
	
}