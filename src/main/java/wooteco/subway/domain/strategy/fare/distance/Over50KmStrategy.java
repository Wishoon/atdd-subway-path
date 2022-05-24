package wooteco.subway.domain.strategy.fare.distance;

import static wooteco.subway.domain.strategy.fare.distance.FareDistanceConstant.ADDITIONAL_FARE;
import static wooteco.subway.domain.strategy.fare.distance.FareDistanceConstant.BASIC_DISTANCE;
import static wooteco.subway.domain.strategy.fare.distance.FareDistanceConstant.BASIC_FARE;
import static wooteco.subway.domain.strategy.fare.distance.FareDistanceConstant.STEP_ONE_CHARGE_DISTANCE;
import static wooteco.subway.domain.strategy.fare.distance.FareDistanceConstant.STEP_ONE_DISTANCE;
import static wooteco.subway.domain.strategy.fare.distance.FareDistanceConstant.STEP_TWO_CHARGE_DISTANCE;

public class Over50KmStrategy implements FareDistanceStrategy {

    @Override
    public int distanceFare(int distance) {
        return BASIC_FARE
                + (int) Math.ceil(Math.min(distance - BASIC_DISTANCE, STEP_ONE_DISTANCE - BASIC_DISTANCE) / STEP_ONE_CHARGE_DISTANCE) * ADDITIONAL_FARE
                + (int) Math.ceil((distance - STEP_ONE_DISTANCE) / STEP_TWO_CHARGE_DISTANCE) * ADDITIONAL_FARE;
    }
}
