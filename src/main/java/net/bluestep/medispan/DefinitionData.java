package net.bluestep.medispan;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DefinitionData {
  private String severityLevel;
  private String onset;
  private String labeledAvoidanceLevel;
  private String managementLevel;
  private String description;
  private String message;

}
