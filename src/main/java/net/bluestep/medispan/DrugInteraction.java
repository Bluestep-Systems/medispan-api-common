package net.bluestep.medispan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author jamess
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DrugInteraction {

	public String severity;
	public String description;
	public String managementlv;
	public String confidence;
	public String onset;
	public String publishedlist;
	public String avoidancelv;

	@Override
	public String toString() {
		return "DrugInteraction [severity=" + severity + ", description=" + description + ", managementlv=" + managementlv
				+ ", confidence=" + confidence + ", onset=" + onset + ", publishedlist=" + publishedlist + ", avoidancelv="
				+ avoidancelv + "]";
	}
	
}

