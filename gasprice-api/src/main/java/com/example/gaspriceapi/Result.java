
package com.example.gaspriceapi;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Result {

    @SerializedName("baseFeePerGas")
    private String mBaseFeePerGas;
    @SerializedName("difficulty")
    private String mDifficulty;
    @SerializedName("extraData")
    private String mExtraData;
    @SerializedName("gasLimit")
    private String mGasLimit;
    @SerializedName("gasUsed")
    private String mGasUsed;
    @SerializedName("hash")
    private String mHash;
    @SerializedName("logsBloom")
    private String mLogsBloom;
    @SerializedName("miner")
    private String mMiner;
    @SerializedName("mixHash")
    private String mMixHash;
    @SerializedName("nonce")
    private String mNonce;
    @SerializedName("number")
    private String mNumber;
    @SerializedName("parentHash")
    private String mParentHash;
    @SerializedName("receiptsRoot")
    private String mReceiptsRoot;
    @SerializedName("sha3Uncles")
    private String mSha3Uncles;
    @SerializedName("size")
    private String mSize;
    @SerializedName("stateRoot")
    private String mStateRoot;
    @SerializedName("timestamp")
    private String mTimestamp;
    @SerializedName("totalDifficulty")
    private String mTotalDifficulty;
    @SerializedName("transactions")
    private List<Transaction> mTransactions;
    @SerializedName("transactionsRoot")
    private String mTransactionsRoot;
    @SerializedName("uncles")
    private List<Object> mUncles;

    public String getBaseFeePerGas() {
        return mBaseFeePerGas;
    }

    public void setBaseFeePerGas(String baseFeePerGas) {
        mBaseFeePerGas = baseFeePerGas;
    }

    public String getDifficulty() {
        return mDifficulty;
    }

    public void setDifficulty(String difficulty) {
        mDifficulty = difficulty;
    }

    public String getExtraData() {
        return mExtraData;
    }

    public void setExtraData(String extraData) {
        mExtraData = extraData;
    }

    public String getGasLimit() {
        return mGasLimit;
    }

    public void setGasLimit(String gasLimit) {
        mGasLimit = gasLimit;
    }

    public String getGasUsed() {
        return mGasUsed;
    }

    public void setGasUsed(String gasUsed) {
        mGasUsed = gasUsed;
    }

    public String getHash() {
        return mHash;
    }

    public void setHash(String hash) {
        mHash = hash;
    }

    public String getLogsBloom() {
        return mLogsBloom;
    }

    public void setLogsBloom(String logsBloom) {
        mLogsBloom = logsBloom;
    }

    public String getMiner() {
        return mMiner;
    }

    public void setMiner(String miner) {
        mMiner = miner;
    }

    public String getMixHash() {
        return mMixHash;
    }

    public void setMixHash(String mixHash) {
        mMixHash = mixHash;
    }

    public String getNonce() {
        return mNonce;
    }

    public void setNonce(String nonce) {
        mNonce = nonce;
    }

    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        mNumber = number;
    }

    public String getParentHash() {
        return mParentHash;
    }

    public void setParentHash(String parentHash) {
        mParentHash = parentHash;
    }

    public String getReceiptsRoot() {
        return mReceiptsRoot;
    }

    public void setReceiptsRoot(String receiptsRoot) {
        mReceiptsRoot = receiptsRoot;
    }

    public String getSha3Uncles() {
        return mSha3Uncles;
    }

    public void setSha3Uncles(String sha3Uncles) {
        mSha3Uncles = sha3Uncles;
    }

    public String getSize() {
        return mSize;
    }

    public void setSize(String size) {
        mSize = size;
    }

    public String getStateRoot() {
        return mStateRoot;
    }

    public void setStateRoot(String stateRoot) {
        mStateRoot = stateRoot;
    }

    public String getTimestamp() {
        return mTimestamp;
    }

    public void setTimestamp(String timestamp) {
        mTimestamp = timestamp;
    }

    public String getTotalDifficulty() {
        return mTotalDifficulty;
    }

    public void setTotalDifficulty(String totalDifficulty) {
        mTotalDifficulty = totalDifficulty;
    }

    public List<Transaction> getTransactions() {
        return mTransactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        mTransactions = transactions;
    }

    public String getTransactionsRoot() {
        return mTransactionsRoot;
    }

    public void setTransactionsRoot(String transactionsRoot) {
        mTransactionsRoot = transactionsRoot;
    }

    public List<Object> getUncles() {
        return mUncles;
    }

    public void setUncles(List<Object> uncles) {
        mUncles = uncles;
    }

}
