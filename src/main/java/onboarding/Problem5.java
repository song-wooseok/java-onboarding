package onboarding;

import onboarding.problem5.service.MoneyUnitCountService;

import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = MoneyUnitCountService.getUnitCount(money);
        return answer;
    }
}
