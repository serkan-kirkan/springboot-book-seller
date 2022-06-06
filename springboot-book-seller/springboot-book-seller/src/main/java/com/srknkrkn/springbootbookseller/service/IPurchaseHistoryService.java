package com.srknkrkn.springbootbookseller.service;

import com.srknkrkn.springbootbookseller.model.PurchaseHistory;
import com.srknkrkn.springbootbookseller.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
