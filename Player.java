class Player{

  float posX;
  float posY;
  int lifePoint;
  String nome;
  int dano;

  Player(String n, int ptsDeVida, float posInicialX, float posInicialY){
    System.out.println("Construtor do Player");
    nome = n;
    lifePoint = ptsDeVida;
    posX = posInicialX;
    posY = posInicialY;
    
  }
  
  void Mover(float posX,float posY){

    posX = posX + 5;
    posY = posY + 5;

  }

  float exibirPosX(){
    return posX;
  }

    float exibirPosY(){
    return posY;
  }

  void receberDanoP(int dano){
    lifePoint = lifePoint - dano;
      
  }

  int danoPlayer(int plus){
    dano = dano + plus;
    return dano;
  }

      String exibirStatus(){
       String status = "nome:" + nome + "Vida:" + lifePoint;
        return status;
  }
}