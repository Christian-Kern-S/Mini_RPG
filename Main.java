class Main {
  public static void main(String[] args) {

    Player player1 = new Player("Bob Lee Swagger",100,10,10);

    String playerStatus = player1.exibirStatus();
    System.out.println(playerStatus);

    Monster monster1 = new Monster("Godzilla",100,10,10);

    String monsterStatus = monster1.exibirStatus();
    System.out.println(monsterStatus);

    


    
  }
}