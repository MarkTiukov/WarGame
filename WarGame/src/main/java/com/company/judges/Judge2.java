package com.company.judges;

import com.company.Main;
import com.company.cells.FarmCell;
import com.company.mygraphics.Interfacable;

public class Judge2 implements Judgable {

    public GameStatus gameStatus = GameStatus.PLAYER1;
    Interfacable myInterface;

    public Judge2() {
    }

    public Judge2(Interfacable myInterface) {
        this.myInterface = myInterface;
    }

    @Override
    public void finishMove() {
        switch (this.gameStatus) {
            case PLAYER1:
                this.gameStatus = GameStatus.PLAYER2;
                myInterface.showEndTurnMsg(GameStatus.PLAYER2.toString());
                break;
            case PLAYER2:
                this.gameStatus = GameStatus.PLAYER1;
                myInterface.showEndTurnMsg(GameStatus.PLAYER1.toString());
                break;
        }
    }

    @Override
    public FarmCell buyFarm() {
        return Main.playableFractions[this.gameStatus.getNumber() - 1].buyFarm();
    }

    public enum GameStatus {
        PLAYER1(1) {
            @Override
            public String toString() {
                return "Player 1";
            }
        },
        PLAYER2(2) {
            @Override
            public String toString() {
                return "Player 2";
            }
        };

        private final int number;

        GameStatus(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }
}
