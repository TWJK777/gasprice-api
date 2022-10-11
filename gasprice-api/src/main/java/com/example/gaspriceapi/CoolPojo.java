
package com.example.gaspriceapi;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CoolPojo {

    @SerializedName("id")
    private Long mId;
    @SerializedName("jsonrpc")
    private String mJsonrpc;
    @SerializedName("result")
    private Result mResult;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getJsonrpc() {
        return mJsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        mJsonrpc = jsonrpc;
    }

    public Result getResult() {
        return mResult;
    }

    public void setResult(Result result) {
        mResult = result;
    }

}
