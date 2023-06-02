package threads;

import control.*;

public class threadBlueCar extends Thread {
    // Instanciando o controller
    mainController controller = new mainController();

    // Metodo que define o controller da thread
    public void setController(mainController controller) {
        this.controller = controller;
    }

    @Override
    public void run() {
        while (true) {
            // PERCORRENDO RUA 3
            controller.rotate(4, -90);
            controller.moveX(3, 4, 1);
            // PERCORRENDO RUA 2
            controller.moveX(2, 4, 0);
            // PERCORRENDO RUA 7
            controller.rotate(4, 180);
            controller.moveY(7, 4, 1);
            // LIBERANDO SEMAFORO DA COLISAO 15
            controller.colision15.release();
            // PERCORRENDO RUA 18
            controller.moveY(18, 4, 1);
            // PERCORRENDO RUA 29
            controller.moveY(29, 4, 1);
            // PERCORRENDO RUA 40
            controller.moveY(40, 4, 1);
            // PERCORRENDO RUA 51
            controller.moveY(51, 4, 1);
            // PERCORRENDO RUA 58
            controller.rotate(4, 90);
            controller.moveX(58, 4, 1);
            // PERCORRENDO RUA 59
            controller.moveX(59, 4, 1);
            // PERCORRENDO RUA 53
            controller.rotate(4, 360);
            controller.moveY(53, 4, 1);
            // PERCORRENDO RUA 42
            controller.moveY(42, 4, 1);
            // PERCORRENDO RUA 31
            controller.moveY(31, 4, 1);
            // PERCORRENDO RUA 20
            controller.moveY(20, 4, 1);
            // PERCORRENDO RUA 09
            controller.moveY(9, 4, 1);
        }
    }
}