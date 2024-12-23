package com.game.ticktacktoe.service;

import com.game.ticktacktoe.model.GameState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WinnerCheckService {
    private GameState gameState;
    private String winner;

    @Autowired
    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public boolean threeInRow() {

        if (!gameState.getField1().isEmpty() && gameState.getField1().equals(gameState.getField2()) &&
                gameState.getField2().equals(gameState.getField3())) {
            setWinner(gameState.getField1());
            return true;
        } else if (!gameState.getField4().isEmpty() && gameState.getField4().equals(gameState.getField5()) &&
                gameState.getField5().equals(gameState.getField6())) {
            setWinner(gameState.getField4());
            return true;
        } else if (!gameState.getField7().isEmpty() && gameState.getField7().equals(gameState.getField8()) &&
                gameState.getField8().equals(gameState.getField9())) {
            setWinner(gameState.getField4());
            ;
            return true;
        }
        return false;
    }

    public boolean threeInColumn() {
        if (!gameState.getField1().isEmpty() && gameState.getField1().equals(gameState.getField4()) &&
                gameState.getField4().equals(gameState.getField7())) {
            setWinner(gameState.getField1());
            return true;
        } else if (!gameState.getField2().isEmpty() && gameState.getField2().equals(gameState.getField5()) &&
                gameState.getField5().equals(gameState.getField8())) {
            setWinner(gameState.getField2());
            return true;
        } else if (!gameState.getField3().isEmpty() && gameState.getField3().equals(gameState.getField6()) &&
                gameState.getField6().equals(gameState.getField9())) {
            setWinner(gameState.getField3());
            return true;
        }
        return false;
    }

    public boolean threeInDiagonal() {
        if (!gameState.getField1().isEmpty() && gameState.getField1().equals(gameState.getField5()) &&
                gameState.getField5().equals(gameState.getField9())){
            setWinner(gameState.getField1());
            return  true;
        } else if(!gameState.getField3().isEmpty() && gameState.getField3().equals(gameState.getField5()) &&
                gameState.getField5().equals(gameState.getField7())){
            setWinner(gameState.getField3());
            return  true;
        }
            return false;
        }
}
