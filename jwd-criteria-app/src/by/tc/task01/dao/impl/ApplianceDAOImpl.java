package by.tc.task01.dao.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {
		List<Appliance> found = new ArrayList<Appliance>();
		TxtParser parser = new TxtParser();
		parser.initialize();
		while (parser.hasNext()) {
			Appliance appliance = parser.parseNext();
			if (compareApplianceToCriteria(criteria, appliance)) {
				found.add(appliance);
			}
		}
		return found;
	}

	private boolean compareApplianceToCriteria(Criteria criteria, Appliance appliance) {
		if (appliance == null) {
			return false;
		}
		Map<String, Object> requiredCriteria = criteria.getCriteria();
		Map<String, Object> applianceCriteria = appliance.getSearchableCriteria();
		for (Map.Entry<String, Object> entry : requiredCriteria.entrySet()) {
			Object applianceValue = applianceCriteria.get(entry.getKey());
			if (!(applianceValue != null && entry.equals(applianceValue))) {
				return false;
			}
		}
		return true;
	}

}

//you may add your own new classes
