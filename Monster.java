class Monster{
  
  int forca;
  int pontosDeVida;
  String nome;
  float posX,posY,posInicialX,posInicialY;
  

    Monster(String n, int ptsDeVida, float posInicialX, float posInicialY){
    System.out.println("Construtor do Monster");
    nome = n;
    pontosDeVida = ptsDeVida;
    posX = posInicialX;
    posY = posInicialY;
    
  }

  void Mover(float posX,float posY){

    posX = posX + 2;
    posY = posY + 2;

  }

  float exibirPosX(){
    return posX;
  }

    float exibirPosY(){
    return posY;
  }
  
  int causarDano(){
    return forca * 3;
  }

  String rugir(){
    return "akjdnakwjbawkbv";
  }
  void receberDano(int dano){
    pontosDeVida -= dano;
    if(pontosDeVida <= 0){
      morrer();
    }
  }

  void morrer(){
    System.out.println("O monstro morreu.");
  }

  String exibirStatus(){
    String status = "nome:" + nome + "Vida:" + pontosDeVida;
        return status;
    }
}