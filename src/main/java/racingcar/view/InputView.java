package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String[] getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요 : ");
        return Console.readLine().split(",");
    }

    public static int getRaceAttempts() {
        System.out.println("시도할 횟수를 입력하세요 :");
        return Integer.parseInt(Console.readLine());
    }
}
