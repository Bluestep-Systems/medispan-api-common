package net.bluestep.medispan;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatientDrugInput {
  private String mediId;
  private boolean scenario;

  private FrequencyRecord frequency;
  private DurationRecord duration;
  private String doseType;
  private String doseRoute;
  private String dose;
  private String scheduleAdmin;

  public PatientDrugInput(final String mediId, final boolean scenario) {
    this.mediId = mediId;
    this.scenario = scenario;
  }

  public void setDose(final float amount, final String uom) {
      final String amt = String.valueOf(amount);
      final String dose = uom == null ? amt : amt + " " + uom;
      setDose(dose);
  }
  
}
