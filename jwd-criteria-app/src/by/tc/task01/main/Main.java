package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliance = new ArrayList<Appliance>();

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());// "Oven"
		criteriaOven.add(Oven.CAPACITY.toString(), 32);

		try {
			appliance = service.find(criteriaOven);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 40);
		criteriaOven.add(Oven.DEPTH.toString(), 60);

		try {
			appliance = service.find(criteriaOven);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);

		try {
			appliance = service.find(criteriaOven);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // find(Object...obj)

		PrintApplianceInfo.print(appliance);

	}

}
