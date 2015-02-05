package com.bnsantos.test.questions;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bnsantos.chapter8.question1.BlackJackCard;
import com.bnsantos.chapter8.question1.BlackJackHand;
import com.bnsantos.chapter8.question1.Deck;
import com.bnsantos.chapter8.question1.Suit;

public class Question8_1 {
	private static final int NUM_PLAYERS = 5;
	private BlackJackHand[] mHands;
	private Deck<BlackJackCard> mDeck;
	
	@Before
	public void init(){
		initHands();
		initDeck();
	}
	
	private void initHands(){
		mHands = new BlackJackHand[NUM_PLAYERS];
		for(int i=0;i<mHands.length;i++){
			mHands[i] = new BlackJackHand();
		}
	}
	
	private void initDeck(){
		ArrayList<BlackJackCard> cards = new ArrayList<BlackJackCard>();
		for (int i = 1; i <= 13; i++) {
			for (int j = 0; j <= 3; j++) {
				Suit suit = Suit.getSuitFromValue(j);
				BlackJackCard card = new BlackJackCard(i, suit);
				cards.add(card);
			}
		}
	
		mDeck = new Deck<BlackJackCard>();
		mDeck.setDeckOfCards(cards);
		mDeck.shuffle();
	}
	
	public boolean dealInitial() {
		for (BlackJackHand hand : mHands) {
			BlackJackCard card1 = mDeck.dealCard();
			BlackJackCard card2 = mDeck.dealCard();
			if (card1 == null || card2 == null) {
				return false;
			}
			hand.addCard(card1);
			hand.addCard(card2);	
		}
		return true;
	}
	
	public ArrayList<Integer> getBlackJacks() {
		ArrayList<Integer> winners = new ArrayList<Integer>();
		for (int i = 0; i < mHands.length; i++) {
			if (mHands[i].isBlackJack()) {
				winners.add(i);
			}
		}
		return winners;
	}

	@Test
	public void test() {
		Assert.assertTrue(dealInitial());
		Assert.assertEquals(2, mHands[0].count());
	}

}
