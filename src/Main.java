//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[] substitutePlayers = {9, 15, 11, 14, 7, 10, 12, 93};
    for (int player : substitutePlayers) {
        if (player == 7) {
            System.out.println(player + ", выходи на поле");
        } else {
            System.out.println(player + ", посиди пока на скамейке");
        }
    }
    System.out.println();
    int[] array = {1, 2, 3, 4, 5, 6};
    int count = 0;
    for (int i = 0; i < array.length; i++) {
        count++;
    }

    System.out.println(count == 6);
    int[] moneyOnBankAccounts = {100, 200, 300, 400, 500};
    int sum = 0;
    for (int bankAccount : moneyOnBankAccounts) {
        sum = sum + bankAccount;
    }

    System.out.println(sum);
    int[] bonuses = {1000, 2000, 25000, 7, 3000000};
    int biggestBonus = 0;
    for (int bonus : bonuses) {
        if (biggestBonus < bonus) {
            biggestBonus = bonus;
        }
    }
    System.out.println(biggestBonus);

    System.out.println("Задача 1");
    int[] inputArray1 = {100, 200, 300, 400, 500};
    int[] outputArray1 = new int[4];
    int sum1 = 0;
    int max = 0;
    int min = inputArray1[0];
    for (int summa : inputArray1) {
        sum1 = sum1 + summa;
    }
    for (int maxim:inputArray1) {
        if (max < maxim) {
            max = maxim;
        }
    }
    for (int minimym : inputArray1) {
        if (min > minimym)
            min = minimym;
    }
    outputArray1[0] = sum1;
    outputArray1[1] = max;
    outputArray1[2] = min;
    outputArray1[3] = sum1/inputArray1.length;
    System.out.println(Arrays.toString(inputArray1));
    System.out.println(Arrays.toString(outputArray1));
    System.out.println("Задача 2");
    int[] inputArray2 = {100,200,300,400,500};
    double[] outputArray2 = new double[5];
    for (int i = 0; i < inputArray2.length; i++) {
        double tax = (double) (inputArray2[i] * 13) / 100;
        outputArray2[i] = tax;
    }
    System.out.println(Arrays.toString(inputArray2));
    System.out.println(Arrays.toString(outputArray2));
    System.out.println("Задача 3");
    int[] inputArray3 = {4000, 5000, 6000,7000,8000};
    boolean[] outputArray3 = new boolean[5];
    for (int i=0; i < inputArray3.length; i++) {
        if (inputArray3[i] > 5000) {
            outputArray3[i] = true;
        } else {
            outputArray3[i] = false;
        }
    }
    System.out.println(Arrays.toString(inputArray3));
    System.out.println(Arrays.toString(outputArray3));
    System.out.println("Задача 4");
    int[] inputArray4 = {-100, 600, 500, -230, 100};
    boolean[] outputArray4 = new boolean[1];
    boolean allPositive = true;
    for (int i=0; i < inputArray4.length; i++) {
        if (inputArray4[i] < 0) {
            allPositive = false;
        break;
    }
    }
    outputArray4[0] = allPositive;
    System.out.println(Arrays.toString(inputArray4));
    System.out.println(Arrays.toString(outputArray4));
    System.out.println("Задача 5");
    int[] inputArray5 = {9423, 6000, 30000, -1000, -12949};
    int[] outputArray5 = new int[1];
    int month = 0;
    for (int cash : inputArray5) {
        if (cash > 0) {
            month++;
        }
    }
    outputArray5[0] = month;
    System.out.println(Arrays.toString(inputArray5));
    System.out.println(Arrays.toString(outputArray5));
}