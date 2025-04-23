package net.bluestep.medispan;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class PatientProfileInput {
	private String gender;
	private Instant birthDate;
	private double weightInKg;
	private double creatinineClearance;
	private List<PatientDrugInput> patientDrugs = new ArrayList<>();
    private List<ObservationRecord> observations = new ArrayList<>();
}
