package net.bluestep.medispan;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdverseEffectsDefinitionData {
  
  private String severityLevel;
  private String incidence;
  private String condition;
  
}
