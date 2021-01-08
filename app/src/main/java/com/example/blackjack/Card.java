package com.example.blackjack;

import android.widget.ImageView;

import static com.example.blackjack.Value.Ace;
import static com.example.blackjack.Value.Eight;
import static com.example.blackjack.Value.Five;
import static com.example.blackjack.Value.Four;
import static com.example.blackjack.Value.Jack;
import static com.example.blackjack.Value.King;
import static com.example.blackjack.Value.Nine;
import static com.example.blackjack.Value.Queen;
import static com.example.blackjack.Value.Seven;
import static com.example.blackjack.Value.Six;
import static com.example.blackjack.Value.Ten;
import static com.example.blackjack.Value.Three;
import static com.example.blackjack.Value.Two;

public class Card {
    private Suit suit;
    private Value value;
    private int imageView;

    public Card(Suit suit, Value value, int imageView) {
        this.suit = suit;
        this.value = value;
        this.imageView = imageView;
    }

    public String toStringCard() {
        return this.value.toString() + "_of_" + this.suit.toString();
    }

    public Value getValue() {
        return this.value;
    }

    public int getValueAsInt() {
        switch (this.value) {
            case Two:
                return 2;
            case Three:
                return 3;
            case Four:
                return 4;
            case Five:
                return 5;
            case Six:
                return 6;
            case Seven:
                return 7;
            case Eight:
                return 8;
            case Nine:
                return 9;
            case Ten:
                return 10;
            case Jack:
                return 10;
            case King:
                return 10;
            case Queen:
                return 10;
            case Ace:
                return 11;
        }
        return 0;
    }

    public int getImageView() {
        return imageView;
    }
}
