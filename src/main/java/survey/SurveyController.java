package survey;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SurveyController {
	private double divV = 14;
	private int divA = 20;
	private int divM = 10;
	private int divR = 12;
	private int divP = 11;
	
	@Autowired
	SurveyRepo rp;

	//löschen??
    @GetMapping("/survey")
    public String greetingForm(Model model) {
        model.addAttribute("survey", new Survey());
        return "survey";
    }

    @PostMapping("/survey")
    public String greetingSubmit(@ModelAttribute Survey survey) {
    	rp.save(survey);
    	
    	List<Survey> surveies = rp.findAll();
    	double avgValueDelivery = 0;
    	int avgStrategicAlignment = 0;
    	int avgResourceManagement = 0;
    	int avgRiskManagement = 0;
    	int avgPerformance = 0;
    	
    	double valueDelivery = survey.getValueDelivery();
    	int strategicAlignment = survey.getStrategicAlignment();
    	int resourceManagement = survey.getResourceManagement();
    	int riskManagement = survey.getRiskManagement();
    	int performance = survey.getPerformance();
    	
    	for(Survey gre : surveies){
    		avgValueDelivery += gre.getValueDelivery();
    		avgStrategicAlignment += gre.getStrategicAlignment();
    		avgResourceManagement += gre.getResourceManagement();
    		avgRiskManagement += gre.getRiskManagement();
    		avgPerformance += gre.getPerformance();
    	}
    	
    	avgValueDelivery = avgValueDelivery / surveies.size();
    	avgStrategicAlignment = avgStrategicAlignment / surveies.size();
    	avgResourceManagement = avgResourceManagement / surveies.size();
    	avgRiskManagement = avgRiskManagement / surveies.size();
    	avgPerformance = avgPerformance / surveies.size();
    	
        survey.setAvgDelvieryValue(avgValueDelivery/divV);
        survey.setAvgStrategicAlignment(avgStrategicAlignment/divA);
        survey.setAvgResourceManagement(avgResourceManagement/divM);
        survey.setAvgRiskManagement(avgRiskManagement/divR);
        survey.setAvgPerformance(avgPerformance/divP);
        
        survey.setValueDelivery(valueDelivery/divV);
        survey.setStrategicAlignment(strategicAlignment/divA);
        survey.setResourceManagement(resourceManagement/divM);
        survey.setRiskManagement(riskManagement/divR);
        survey.setPerformance(performance/divP); 
        return "result";
       
         
        
        
    }
}