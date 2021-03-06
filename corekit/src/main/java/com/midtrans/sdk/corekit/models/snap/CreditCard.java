package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ziahaqi on 8/5/16.
 */
public class CreditCard {

    public static final String MIGS = "migs";

    @SerializedName("save_card")
    private boolean saveCard;
    @SerializedName("token_id")
    private String tokenId;
    private boolean secure;
    private String channel;
    private String bank;
    @SerializedName("saved_tokens")
    private List<SavedToken> savedTokens;
    @SerializedName("whitelist_bins")
    private ArrayList<String> whitelistBins;
    @SerializedName("installment")
    private Installment installment;
    private String type;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public boolean isSaveCard() {
        return saveCard;
    }

    public void setSaveCard(boolean saveCard) {
        this.saveCard = saveCard;
    }

    public boolean isSecure() {
        return secure;
    }

    public void setSecure(boolean secure) {
        this.secure = secure;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public List<SavedToken> getSavedTokens() {
        return savedTokens;
    }

    public void setSavedTokens(List<SavedToken> savedTokens) {
        this.savedTokens = savedTokens;
    }

    public ArrayList<String> getWhitelistBins() {
        return whitelistBins;
    }

    public Installment getInstallment() {
        return installment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
