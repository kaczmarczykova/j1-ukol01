package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

// Vesnicka na slunci
  public void start() {
    zofka = new Turtle();

    zofka.penUp();
    zofka.move(150);
    zofka.penDown();

    slunicko();

    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(500);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(180);
    zofka.penDown();

    vesnicka();

    zofka.turnRight(90);
    zofka.move(70);
    zofka.turnRight(90);
    zofka.move(150);
    zofka.turnLeft(90);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penDown();

    domecek();

    zofka.penUp();
    zofka.turnLeft(135);
    zofka.move(300);
    zofka.turnRight(180);
    zofka.penDown();

    prasatko();

    zofka.penUp();
    zofka.turnLeft(50);
    zofka.move(200);
    zofka.turnLeft(85);
    zofka.move(50);

    domecek();

    zofka.penUp();
    zofka.turnRight(45);zofka.move(500);
    zofka.turnLeft(90);
    zofka.move(150);
    zofka.turnLeft(90);
    zofka.penDown();

    //zofka.turnRight(90);
    pismenoZ();

    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(180);
    zofka.turnRight(90);
    zofka.move(50);
    zofka.turnRight(90);
    zofka.penDown();

    pismenoU();

    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(50);
    zofka.penDown();

    pismenoZ();

    zofka.penUp();
    zofka.move(50);
    zofka.penDown();
    zofka.turnLeft(90);

    pismenoK();

    zofka.penUp();
    zofka.turnLeft(45);
    zofka.move(50);
    zofka.penDown();

    pismenoA();

    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(200);
    zofka.turnLeft(90);
  }

   public void slunicko() {
     for (int i = 0; i < 9; i++) {
       for (int j = 0; j < 2; j++) {
         zofka.turnLeft(20);
         zofka.move(10);
       }
       zofka.turnRight(90);
       zofka.move(15);
       zofka.turnRight(180);
       zofka.move(15);
       zofka.turnRight(90);
     }
   }

  public void ctverecek() {
    zofka.penDown();
    for (int i = 0; i < 4; i++) {
      zofka.turnLeft(90);
      zofka.move(50);
    }
  }

  public void strecha() {
    zofka.turnLeft(45);
    zofka.move(37);
    zofka.turnLeft(90);
    zofka.move(37);
  }

  public void prasatko() {
    ctverecek();
    strecha();
    for (int i = 0; i < 2; i++) {
      nohy();
      zofka.turnRight(70);
      zofka.penUp();
      zofka.move(50);
      zofka.turnRight(50);
      zofka.penDown();
    }
  }

  public void domecek() {
    ctverecek();
    strecha();
  }

  public void vesnicka() {
      for (int i = 0; i < 8; i++) {
      domecek();
      zofka.turnRight(45);
      zofka.penUp();
      zofka.move(70);
      zofka.turnRight(90);
      }
  }

  public void nohy() {
    zofka.move(20);
    zofka.turnRight(120);
    zofka.penUp();
    zofka.move(25);
    zofka.turnRight(120);
    zofka.penDown();
    zofka.move(20);
  }

  public void pismenoZ() {
    zofka.move(100);
    zofka.turnRight(120);
    zofka.move(200);
    zofka.turnLeft(120);
    zofka.move(100);
  }

  public void pismenoU() {
    zofka.move(140);
    for (int i = 0; i < 9; i++) {
      zofka.turnLeft(20);
      zofka.move(15);
    }
    zofka.move(125);
  }

  public void pismenoK() {
    zofka.move(180);
    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(90);
    zofka.penDown();
    zofka.turnLeft(135);
    zofka.move(130);
    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(130);
    zofka.penDown();
    zofka.turnLeft(90);
    zofka.move(130);
  }

  public void pismenoA() {
    zofka.turnLeft(70);
    zofka.move(200);
    zofka.turnRight(140);
    zofka.move(200);
    zofka.turnRight(180);
    zofka.move(75);
    zofka.turnLeft(70);
    zofka.move(85);
  }
}
