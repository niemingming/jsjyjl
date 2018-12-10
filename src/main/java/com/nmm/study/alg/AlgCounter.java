package com.nmm.study.alg;

import com.nmm.study.model.Source;
import lombok.Data;

//计数器
@Data
public class AlgCounter {

    private long currentDate;
    private double currentData;

    private int count=0;

    private int total = 0;

    public void count(Source source) {
        if (source.getData() != currentData) {//不同的情况
            currentData = source.getData();
            currentDate = source.getDate();
            count = 1;
            return;
        }
        //数值相同，日期不同，计数增加，到7加1具体业务需要待定
        if (source.getData() == currentData && currentDate!=source.getDate()){
            count++;
        }
        if (count == 7) {
            total++;
            count=0;
        }

    }



}
