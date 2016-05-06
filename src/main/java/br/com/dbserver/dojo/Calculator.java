package br.com.dbserver.dojo;

import java.util.Arrays;

public class Calculator {

    public Integer sum(Integer... nums) {
        return Arrays.asList(nums).stream().mapToInt(i -> i).sum();
    }

}
