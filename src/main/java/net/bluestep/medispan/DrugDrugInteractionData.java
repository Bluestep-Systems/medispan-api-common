package net.bluestep.medispan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class DrugDrugInteractionData {
  private String message;
  private DefinitionData definition;
  private List<DrugDrugInteractionMed> meds;
}
