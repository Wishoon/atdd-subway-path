package wooteco.subway.admin.domain.type.weightstrategy;

import wooteco.subway.admin.domain.LineStation;

public class DistanceWeightStrategy implements WeightStrategy {
	@Override
	public double getWeight(LineStation lineStation) {
		return lineStation.getDistance();
	}
}
