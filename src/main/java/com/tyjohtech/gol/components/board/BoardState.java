package com.tyjohtech.gol.components.board;

import com.tyjohtech.app.property.AbstractObservable;
import com.tyjohtech.gol.model.Board;

public class BoardState extends AbstractObservable<BoardState> {

    private Board board;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
        notifyListeners(this);
    }
}