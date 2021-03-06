package com.esprit.hypnotrip.services.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.esprit.hypnotrip.persistence.Buy;
import com.esprit.hypnotrip.persistence.Offer;

@Local
public interface OfferServiceLocal {
	void addBuy(Buy buy);

	Offer mostBoughtOffer();

	Offer bestOffer();

	List<Offer> SortOfferByDatePrice();
}
