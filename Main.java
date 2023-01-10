class Main {
  public static void main(String[] args) {
    final int x = 3;
    System.out.println("Tabela de multiplicação de " + x);

    for (int i = 1; i <= 10; i++) {
      int product = x * i;
      String response = String.format("%d x %d = %d", x, i, product);

      System.out.println(response);
    }
  }
}