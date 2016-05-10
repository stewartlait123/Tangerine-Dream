/**
 * 
 * @author Stewart Lait
 *
 */

package com.qa.tangerinedream.controllers;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.OrderLine;
import com.qa.tangerinedream.service.BasketService;
import com.qa.tangerinedream.service.WishlistService;

/**
 * This is the controller for the wishlist. Any time you need to do anything
 * with the wishlist, use this.
 * 
 * @author Stewart "noob" Lait
 */
@Named(value = "wishlist")
@RequestScoped
public class WishlistController {

	@Inject
	private BasketService basketService;
	@Inject
	private WishlistService wishlistService;
	@Inject
	private CurrentUser currentUser;

	private List<OrderLine> wishlist;

	/**
	 * This method will add the product to the users wishlist
	 * 
	 * @param productId
	 *            - this is the ID of the product to add
	 */
	public void addToWishlist(long productId) {
		wishlistService.addToWishlist(productId, currentUser.getUserID());
	}

	/**
	 * This is for removing an item from the wishlist
	 * 
	 * @param productId
	 *            - the product to remove
	 * @return - Returns "wishlist" to reload the wishlist page
	 */
	public String removeFromWishlist(long productId) {
		wishlistService.removeFromWishlist(productId, currentUser.getUserID());
		return "wishlist";
	}

	/**
	 * this method removes a product from the wishlist and adds it to the basket
	 * 
	 * @param productId
	 *            - the product to buy
	 * @return - Returns "wishlist" to reload the wishlist page
	 */
	public String addToBasketFromWishlist(long productId) {
		removeFromWishlist(productId);
		basketService.addToBasket(productId, 0, currentUser.getUserID());
		return "wishlist";
	}

	/**
	 * If you want to know what I want ;)
	 * 
	 * @return - the users wishlist
	 */
	public List<OrderLine> getWishlist() {
		try {
			if (wishlist == null)
			wishlist = wishlistService.getWishlist(currentUser.getUserID());
		} catch (NullPointerException npe) {
			npe.printStackTrace();
			return null;
		}
		return wishlist;

	}
	
	}

