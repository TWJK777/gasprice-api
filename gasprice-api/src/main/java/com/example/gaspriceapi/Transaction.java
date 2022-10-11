
package com.example.gaspriceapi;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Transaction {

    @SerializedName("blockHash")
    private String mBlockHash;
    @SerializedName("blockNumber")
    private String mBlockNumber;
    @SerializedName("chainId")
    private String mChainId;
    @SerializedName("from")
    private String mFrom;
    @SerializedName("gas")
    private String mGas;
    @SerializedName("gasPrice")
    private String mGasPrice;
    @SerializedName("hash")
    private String mHash;
    @SerializedName("input")
    private String mInput;
    @SerializedName("nonce")
    private String mNonce;
    @SerializedName("r")
    private String mR;
    @SerializedName("s")
    private String mS;
    @SerializedName("to")
    private String mTo;
    @SerializedName("transactionIndex")
    private String mTransactionIndex;
    @SerializedName("type")
    private String mType;
    @SerializedName("v")
    private String mV;
    @SerializedName("value")
    private String mValue;

    public String getBlockHash() {
        return mBlockHash;
    }

    public void setBlockHash(String blockHash) {
        mBlockHash = blockHash;
    }

    public String getBlockNumber() {
        return mBlockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        mBlockNumber = blockNumber;
    }

    public String getChainId() {
        return mChainId;
    }

    public void setChainId(String chainId) {
        mChainId = chainId;
    }

    public String getFrom() {
        return mFrom;
    }

    public void setFrom(String from) {
        mFrom = from;
    }

    public String getGas() {
        return mGas;
    }

    public void setGas(String gas) {
        mGas = gas;
    }

    public String getGasPrice() {
        return mGasPrice;
    }

    public void setGasPrice(String gasPrice) {
        mGasPrice = gasPrice;
    }

    public String getHash() {
        return mHash;
    }

    public void setHash(String hash) {
        mHash = hash;
    }

    public String getInput() {
        return mInput;
    }

    public void setInput(String input) {
        mInput = input;
    }

    public String getNonce() {
        return mNonce;
    }

    public void setNonce(String nonce) {
        mNonce = nonce;
    }

    public String getR() {
        return mR;
    }

    public void setR(String r) {
        mR = r;
    }

    public String getS() {
        return mS;
    }

    public void setS(String s) {
        mS = s;
    }

    public String getTo() {
        return mTo;
    }

    public void setTo(String to) {
        mTo = to;
    }

    public String getTransactionIndex() {
        return mTransactionIndex;
    }

    public void setTransactionIndex(String transactionIndex) {
        mTransactionIndex = transactionIndex;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getV() {
        return mV;
    }

    public void setV(String v) {
        mV = v;
    }

    public String getValue() {
        return mValue;
    }

    public void setValue(String value) {
        mValue = value;
    }

}
