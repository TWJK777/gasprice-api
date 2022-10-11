package com.example.gaspriceapi;

import com.google.gson.Gson;
import org.apache.commons.math3.util.Precision;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.DoubleStream;

@Service
public class RestService {

    private final RestTemplate restTemplate;

    public RestService(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    public String getPostsPlainJSON() {
        // create headers
        HttpHeaders headers = new HttpHeaders();
// set `content-type` header
        headers.setContentType(MediaType.APPLICATION_JSON);
// set `accept` header
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        String s = "{\"jsonrpc\":\"2.0\",\"method\":\"eth_getBlockByNumber\",\"params\":[\"latest\", true],\"id\":1}";

        // build the request
        HttpEntity<String> entity = new HttpEntity<>(s, headers);

        String url = "https://mainnet.infura.io/v3/68552c4c39ca4bcba649d457326f29b4?";

// send POST request
        ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);

        // parse the json
        Gson gson = new Gson();
        CoolPojo coolPojo = gson.fromJson(response.getBody(), CoolPojo.class);


        List<Transaction> list = coolPojo.getResult().getTransactions();
        String ascendingPrices = "";

        OptionalDouble average = list.stream().mapToDouble(transaction -> Long.decode(transaction.getGasPrice()) / 1000000000.0).average();
        OptionalDouble max = list.stream().mapToDouble(transaction -> Long.decode(transaction.getGasPrice()) / 1000000000.0).max();
        OptionalDouble min = list.stream().mapToDouble(transaction -> Long.decode(transaction.getGasPrice()) / 1000000000.0).min();
        DoubleStream sorted = list.stream().mapToDouble(transaction -> Long.decode(transaction.getGasPrice()) / 1000000000.0).sorted();

        List<Double> sortedListA = sorted.boxed().toList();
        List<Double> sortedList = sortedListA.stream().map(a -> Precision.round(a, 1)).toList();


        Map<Double, Integer> hashMap = new HashMap<>();

        for (Double gasPrice : sortedList) {
            int count = hashMap.getOrDefault(gasPrice, 0);
            hashMap.put(gasPrice, count + 1);
        }

        List<Double> listWithoutDuplicates = sortedList.stream().distinct().toList();
        for (Double item : listWithoutDuplicates) {
            ascendingPrices = ascendingPrices + " [gasprice: " + item + ", count: " + hashMap.get(item) + "]";
        }

        String result = "Most recent block number: " + getRecentBlockNumber(coolPojo.getResult().getTransactions().get(0).getBlockNumber())
                + " Block numbers for all transactions: " + getAllTransactions(coolPojo.getResult().getTransactions())
                + " Number of transactions: " + getNumberOfTransactions(coolPojo.getResult().getTransactions())
                + " Average gas price: " + getAverageGasPrice(average) + " gwei"
                + " Max gas price: " + getMaxGasPrice(max) + " gwei"
                + " Min gas price: " + getMinimumGasPrice(min) + " gwei"
                + " All transaction prices: " + ascendingPrices;

        return result;
    }

    public Integer getRecentBlockNumber(String blockNumber){
        return Integer.decode(blockNumber);
    }

    public String getAllTransactions(List<Transaction> transactions){
        String blockNumbers = "";
        for (Transaction t : transactions) {
            blockNumbers += " " + Integer.decode(t.getBlockNumber());
        }
        return blockNumbers;
    }

    public int getNumberOfTransactions(List<Transaction> transactions){
        return transactions.size();
    }

    public String getAverageGasPrice(OptionalDouble averagePrice){
        return new DecimalFormat("#.#").format(averagePrice.getAsDouble());
    }

    public String getMaxGasPrice(OptionalDouble maxPrice){
        return new DecimalFormat("#.#").format(maxPrice.getAsDouble());
    }

    public String getMinimumGasPrice(OptionalDouble minimumPrice){
        return new DecimalFormat("#.#").format(minimumPrice.getAsDouble());
    }
}