package wooteco.subway.domain.strategy.fare.distance;

import static wooteco.subway.domain.strategy.fare.distance.FareDistanceConstant.BASIC_FARE;

public class DefaultStrategy implements FareDistanceStrategy {

    @Override
    public int distanceFare(int distance) {
        return BASIC_FARE;
    }
}
