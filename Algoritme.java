public class Algoritme{

  	public static void main(String[] args){
      int[] tal = {1,2,4,6,8,12,16,26,30,31,35,40,47,52,63,67,72,79,90,100};
      int maal = (int) (Math.random()*20);
      System.out.println("Listen er: 1,2,4,6,8,12,16,26,30,31,35,40,47,52,63,67,72,79,90,100");
      System.out.println(tal[maal] + " skal findes paa plads " + maal);
      int nu = 10;
      int ex1 = 0;
      int ex2 = 19;


      //for(int i = 0;i<15;i++){
      while(nu != maal){
        if(nu<0){nu=0;}
        if(nu>19){nu=19;}
        System.out.println(tal[nu]);

        if(nu>maal){
          ex2 = nu;
          if(tal[nu] == 2) {nu--;}
          else{
            nu = nu-((nu-ex1)/2) + (int) (Math.random()*2) - (int) (Math.random()*2);
          }
        }
        else if(nu<maal){
          ex1 = nu;
          nu = nu+((ex2 - nu)/2) + (int) (Math.random()*2) - (int) (Math.random()*2);
        }
      }
      System.out.println("tallet er " + tal[nu] + " og det har plads " + nu + " i listen");
    }
  }
