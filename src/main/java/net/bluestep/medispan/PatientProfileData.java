package net.bluestep.medispan;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class PatientProfileData {
  
	private List<DrugDrugInteractionData> drugDrugInteractions = new ArrayList<>();
	private List<DrugsAndMessageData> diseaseContraindications = new ArrayList<>();
	private List<DrugsAndMessageData> genderContraindications = new ArrayList<>();
	private List<DrugsAndMessageData> ageContraindications = new ArrayList<>();
	private List<DrugsAndMessageData> pregnancyContraindications = new ArrayList<>();
	private List<DrugsAndMessageData> lactationContraindications = new ArrayList<>();
	private List<String> doseScreening = new ArrayList<>();
	private Map<String, List<String>> masterDoseScreening = new HashMap<>();
	private List<String> ingredientDoseScreening = new ArrayList<>();
	private List<DrugsAndMessageData> foodDrugInteractions = new ArrayList<>();
	private List<DrugsAndMessageData> alcoholDrugInteractions = new ArrayList<>();
	private Map<String, List<AdverseEffectsDefinitionData>> adverseEffectsDefinition = new HashMap<>();
	private List<String> psychotropicMeds = new ArrayList<>();
	private Map<String, List<String>> brandVsGenericScreen = new HashMap<>();
	private List<DrugsAndMessageData> duplicateTherapy = new ArrayList<>();

	//Need access to util.BEERS_LIST database for this
	//Beers List => Bluestep Med List
	//private List<String> bsMedScreening = new ArrayList<>();
	


	// public List<String> getBsMedScreening() {
	// 	return bsMedScreening;
	// }
	// public void setBsMedScreening(final List<String> bsMedScreening) {
	// 	this.bsMedScreening = bsMedScreening;
	// }
	
}
